package org.gangel.dropwizard.playground.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class CpuInfo {

    public abstract Integer getProcessorsCount();

    public static CpuInfo create(Integer newValue) {
        return new AutoValue_CpuInfo(newValue);
    }

}
