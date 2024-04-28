package org.pram.quarkus.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.pram.quarkus.UserEntity;
import org.openapi.quarkus.user_template_open_api_yml.model.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T11:09:23-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Homebrew)"
)
@ApplicationScoped
public class UserMapperImpl implements UserMapper {

    @Override
    public User userFromDomainToResponse(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        User user = new User();

        user.username( entity.getUsername() );
        user.name( entity.getName() );
        user.email( entity.getEmail() );
        if ( entity.getCreatedAt() != null ) {
            user.createdAt( LocalDateTime.ofInstant( entity.getCreatedAt().toInstant(), ZoneOffset.UTC ).toLocalDate() );
        }
        if ( entity.getUpdatedAt() != null ) {
            user.updatedAt( LocalDateTime.ofInstant( entity.getUpdatedAt().toInstant(), ZoneOffset.UTC ).toLocalDate() );
        }

        return user;
    }

    @Override
    public List<User> usersFromDomainToResponse(List<UserEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( entities.size() );
        for ( UserEntity userEntity : entities ) {
            list.add( userFromDomainToResponse( userEntity ) );
        }

        return list;
    }
}
