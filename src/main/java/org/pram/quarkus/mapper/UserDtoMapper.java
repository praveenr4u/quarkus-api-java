package org.pram.quarkus.mapper;


import org.pram.quarkus.UserEntity;
import org.pram.quarkus.dto.UserDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface UserDtoMapper {
    @BeanMapping(builder = @Builder( disableBuilder = true ))
    UserDto userToUserDto(UserEntity userEntity);
    @BeanMapping(builder = @Builder( disableBuilder = true ))
    UserEntity userDtoToUser(UserDto userDto);
    List<UserEntity> userDtoListToUserList(List<UserDto> all);
}
