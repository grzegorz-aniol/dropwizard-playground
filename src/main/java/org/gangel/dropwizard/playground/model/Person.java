package org.gangel.dropwizard.playground.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Person {

    abstract String getName();

    abstract int getCount();

    public static Person create(String newName, int newCount) {
        return new AutoValue_Person(newName, newCount);
    }

}
