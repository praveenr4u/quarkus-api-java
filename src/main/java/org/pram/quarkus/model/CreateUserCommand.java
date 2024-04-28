package org.pram.quarkus.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateUserCommand {
    private String username;
    private String name;
    private String email;
}

