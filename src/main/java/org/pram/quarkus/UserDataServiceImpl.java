package org.pram.quarkus;

import jakarta.persistence.EntityManager;

import org.pram.quarkus.dto.UserDto;
import org.pram.quarkus.exception.EntityAlreadyExistException;
import org.pram.quarkus.exception.EntityNotFoundException;
import org.pram.quarkus.mapper.UserDtoMapper;
import org.pram.quarkus.repository.UserDataService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataServiceImpl extends BaseDataServiceImpl<Long, UserDto> implements UserDataService {

    private final UserRepository userRepo;

    private final UserDtoMapper userDtoMapper;

    public UserDataServiceImpl(EntityManager entityManager, UserRepository repo, UserDtoMapper userDtoMapper) {
        super(entityManager);
        this.userRepo = repo;
        this.userDtoMapper = userDtoMapper;
    }

    @Override
    public UserEntity getUserByUsername(String username) {
        return userDtoMapper.userDtoToUser(userRepo.findByUsername(username).orElseThrow(
                () -> new EntityNotFoundException("User not found"))
        );
    }

    public UserEntity add(UserEntity userEntity) {
        if (userRepo.existsByUsername(userEntity.getUsername())) {
            throw new EntityAlreadyExistException("User",
                    "username",
                    userEntity.getUsername());
        }
        return userDtoMapper.userDtoToUser(
                userRepo.save(userDtoMapper.userToUserDto(userEntity))
        );
    }

    @Override
    public UserEntity update(UserEntity user) {
        UserDto entity = userDtoMapper.userToUserDto(user);
        UserDto saved = userRepo.save(beforeUpdate(entity));
        return userDtoMapper.userDtoToUser(saved);
    }

    @Override
    public UserEntity delete(String username) {
        UserEntity userEntity = userDtoMapper.userDtoToUser(userRepo.findByUsername(username).orElseThrow(
                () -> new EntityNotFoundException("User not found"))
        );
        userRepo.deleteByUsername(username);
        return userEntity;
    }

    @Override
    public List<UserEntity> getAll() {

        return userDtoMapper.userDtoListToUserList(userRepo.findAll());
    }
}
