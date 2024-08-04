package com.proyectum.ddd.aggregate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class Aggregate<ID extends ValueObject<UUID>> {

    private ID id;
    private final List<DomainEvent> events;

    protected Aggregate() {
        this.events = new ArrayList<>();
    }

    protected Aggregate(final ID id) {
        this();
        this.id = id;
    }

    public ID getId() {
        return this.id;
    }

    public List<DomainEvent> getDomainEvents() {
        return Collections.unmodifiableList(this.events);
    }

    protected void registerEvent(DomainEvent event) {
        assert event != null;
        this.events.add(event);
    }
}
