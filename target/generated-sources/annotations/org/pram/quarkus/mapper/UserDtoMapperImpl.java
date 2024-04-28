package org.pram.quarkus.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.pram.quarkus.UserEntity;
import org.pram.quarkus.dto.UserDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T11:09:23-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Homebrew)"
)
@ApplicationScoped
public class UserDtoMapperImpl implements UserDtoMapper {

    @Override
    public UserDto userToUserDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( userEntity.getId() );
        userDto.setCreatedAt( userEntity.getCreatedAt() );
        userDto.setUpdatedAt( userEntity.getUpdatedAt() );
        userDto.setUsername( userEntity.getUsername() );
        userDto.setName( userEntity.getName() );
        userDto.setEmail( userEntity.getEmail() );

        return userDto;
    }

    @Override
    public UserEntity userDtoToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( userDto.getId() );
        userEntity.setCreatedAt( userDto.getCreatedAt() );
        userEntity.setUpdatedAt( userDto.getUpdatedAt() );
        userEntity.setUsername( userDto.getUsername() );
        userEntity.setName( userDto.getName() );
        userEntity.setEmail( userDto.getEmail() );

        return userEntity;
    }

    @Override
    public List<UserEntity> userDtoListToUserList(List<UserDto> all) {
        if ( all == null ) {
            return null;
        }

        List<UserEntity> list = new ArrayList<UserEntity>( all.size() );
        for ( UserDto userDto : all ) {
            list.add( userDtoToUser( userDto ) );
        }

        return list;
    }
}
