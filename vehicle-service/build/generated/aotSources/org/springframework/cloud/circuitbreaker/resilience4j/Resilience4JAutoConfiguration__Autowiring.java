package org.springframework.cloud.circuitbreaker.resilience4j;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link Resilience4JAutoConfiguration}.
 */
public class Resilience4JAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static Resilience4JAutoConfiguration apply(RegisteredBean registeredBean,
      Resilience4JAutoConfiguration instance) {
    AutowiredFieldValueResolver.forField("customizers").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
