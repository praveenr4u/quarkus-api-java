package org.pram.quarkus.handler;

public interface CommandHandler<T, U> {
    U handle(T command);
}

