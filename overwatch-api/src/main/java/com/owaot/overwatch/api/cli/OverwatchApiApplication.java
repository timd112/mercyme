package com.owaot.overwatch.api.cli;

import com.owaot.overwatch.api.conf.OverwatchApiConfiguration;
import com.owaot.overwatch.api.resources.UserResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverwatchApiApplication extends Application<OverwatchApiConfiguration> {
  private static final Logger LOG = LoggerFactory.getLogger(OverwatchApiApplication.class);

  public static void main(String ... args) throws Exception{
    new OverwatchApiApplication().run(args);
  }

  @Override
  public void run(OverwatchApiConfiguration overwatchApiConfiguration, Environment environment) throws Exception {
    environment.jersey().register(new UserResource());
  }
}
