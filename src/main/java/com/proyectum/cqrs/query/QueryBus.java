package com.proyectum.cqrs.query;

public interface QueryBus {

    <R> R ask(Query query);
}
