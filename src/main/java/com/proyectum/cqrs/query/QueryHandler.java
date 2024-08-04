package com.proyectum.cqrs.query;

public interface QueryHandler<Q extends Query, R> {

    R ask(Q query);
}
