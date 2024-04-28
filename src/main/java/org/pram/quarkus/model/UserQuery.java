package org.pram.quarkus.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserQuery implements Query{
    private String username;
}
