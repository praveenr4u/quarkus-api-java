package org.pram.quarkus;

public interface QueryHandler<Q, R>{
    R handle(Q query);
}

