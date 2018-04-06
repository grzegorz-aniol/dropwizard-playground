package org.gangel.dropwizard.playground;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class PlaygroundConfiguration extends Configuration {

    @NotEmpty
    private String serviceName;

    private Integer processorsCount;

    @JsonProperty
    public String getServiceName() {
        return this.serviceName;
    }

    @JsonProperty
    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    @JsonProperty
    public Integer getProcessorsCount() {
        return this.processorsCount;
    }

}
