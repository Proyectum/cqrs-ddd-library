package com.proyectum.cqrs.commad;

public interface CommandHandler <C extends Command, R> {

    R handle(C command);
}
