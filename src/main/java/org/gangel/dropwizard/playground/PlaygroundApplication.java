package org.gangel.dropwizard.playground;

import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.gangel.dropwizard.playground.health.TemplateHealthCheck;
import org.gangel.dropwizard.playground.resources.CpuInfoResource;
import org.gangel.dropwizard.playground.resources.HelloWorldResource;

public class PlaygroundApplication extends Application<PlaygroundConfiguration> {

    public static void main(final String[] args) throws Exception {
        new PlaygroundApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-playground";
    }

    @Override
    public void initialize(final Bootstrap<PlaygroundConfiguration> bootstrap) {
        // variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(new SubstitutingSourceProvider(
            bootstrap.getConfigurationSourceProvider(), new EnvironmentVariableSubstitutor(false)
        ));

    }

    @Override
    public void run(final PlaygroundConfiguration configuration,
                    final Environment environment) {
        environment.healthChecks().register("health", new TemplateHealthCheck());
        environment.jersey().register(new HelloWorldResource());
        environment.jersey().register(new CpuInfoResource(configuration.getProcessorsCount()));
    }


}
