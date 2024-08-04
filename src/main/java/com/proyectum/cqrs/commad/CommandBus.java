package com.proyectum.cqrs.commad;

public interface CommandBus {

    <R> R handle(Command command);
}
