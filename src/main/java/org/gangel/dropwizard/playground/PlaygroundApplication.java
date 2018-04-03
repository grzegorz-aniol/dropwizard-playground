package org.gangel.dropwizard.playground;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.gangel.dropwizard.playground.health.TemplateHealthCheck;
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
        // TODO: application initialization
    }

    @Override
    public void run(final PlaygroundConfiguration configuration,
                    final Environment environment) {
        environment.healthChecks().register("health", new TemplateHealthCheck());
        environment.jersey().register(new HelloWorldResource());

    }


}
