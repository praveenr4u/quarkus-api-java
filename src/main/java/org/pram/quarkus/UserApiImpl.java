package org.pram.quarkus;

import jakarta.inject.Inject;

import org.pram.quarkus.handler.CreateUserCommandHandler;
import org.pram.quarkus.mapper.UserMapper;
import org.pram.quarkus.model.CreateUserCommand;
import org.pram.quarkus.model.UsersQuery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openapi.quarkus.user_template_open_api_yml.api.UsersApi;
import org.openapi.quarkus.user_template_open_api_yml.model.CreateUserRequest;
import org.openapi.quarkus.user_template_open_api_yml.model.UpdateUserRequest;
import org.openapi.quarkus.user_template_open_api_yml.model.User;

import java.util.List;

public class UserApiImpl implements UsersApi {


    private final Logger logger = LogManager.getLogger(UserApiImpl.class);


    @Inject
    UserRepository userRepository;
    @Inject
    UserMapper userMapper;
    @Inject
    UsersQueryHandler usersQueryHandler;

    @Inject
    CreateUserCommandHandler createUserCommandHandler;

   /* public UserApiImpl(UsersQueryHandler usersQueryHandler, UserRepository userRepository, UserMapper userMapper)
    {
        this.userMapper = userMapper;
        this.usersQueryHandler = usersQueryHandler;
        this.userRepository = userRepository;
    }*/

    @Override
    public User createUser(CreateUserRequest user) {

        logger.info("Creating user: {}", user.getUsername());
        CreateUserCommand createUserCommand = CreateUserCommand.builder()
                .username(user.getUsername())
                .name(user.getName())
                .email(user.getEmail())
                .build();
        User userResponse = userMapper.userFromDomainToResponse(createUserCommandHandler.handle(createUserCommand));
        return userResponse;
    }

    @Override
    public User deleteUser(String username) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {

        logger.info("Getting all users");
        UsersQuery usersQuery = UsersQuery.builder()
                .build();
        List<User> userslist = userMapper.usersFromDomainToResponse(usersQueryHandler.handle(usersQuery));
        // change to return new ResponseEntity<>(userslist, HttpStatus.OK);
        return userslist;


    }

    @Override
    public User getUser(String username) {
        return new User();
    }

    @Override
    public User updateUser(String username, UpdateUserRequest updateUserRequest) {
        return new User();
    }
}