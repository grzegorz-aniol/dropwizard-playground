package org.gangel.dropwizard.playground.resources;

import org.gangel.dropwizard.playground.model.CpuInfo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cpuinfo")
public class CpuInfoResource {

    final private Integer processorsCount;

    public CpuInfoResource(Integer processorsCount) {
        this.processorsCount = processorsCount;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CpuInfo getCpuInfo() {
        return CpuInfo.create(this.processorsCount);
    }
}
