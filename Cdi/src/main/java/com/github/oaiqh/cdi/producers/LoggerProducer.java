package com.github.oaiqh.cdi.producers;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggerProducer {
  @Produces
  private Logger createLogger(InjectionPoint point) {
    return Logger.getLogger(point.getMember().getDeclaringClass().getCanonicalName());
  }
}
