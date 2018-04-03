package org.gangel.dropwizard.playground.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloWorldData {

    private String data;

    public HelloWorldData() {
    }

    public HelloWorldData(final String data) {
        this.data = data;
    }

    @JsonProperty
    public String getData() {
        return data;
    }
}
