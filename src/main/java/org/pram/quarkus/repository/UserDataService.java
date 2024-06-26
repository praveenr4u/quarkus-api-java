package org.pram.quarkus.repository;



import jakarta.enterprise.context.ApplicationScoped;
import org.pram.quarkus.UserEntity;

import java.util.List;

@ApplicationScoped
public interface UserDataService {
    UserEntity getUserByUsername(String username);
    UserEntity add(UserEntity user);

    UserEntity update(UserEntity user);

    UserEntity delete(String username);
    List<UserEntity> getAll();
}
