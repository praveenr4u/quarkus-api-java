package org.pram.quarkus.mapper;


import jakarta.enterprise.context.ApplicationScoped;
import org.pram.quarkus.UserEntity;
import org.mapstruct.Mapper;
import org.openapi.quarkus.user_template_open_api_yml.model.User;

import java.util.List;

@ApplicationScoped
@Mapper(componentModel = "cdi")
public interface UserMapper {

    User userFromDomainToResponse(UserEntity entity);

    List<User> usersFromDomainToResponse(List<UserEntity> entities);
}
