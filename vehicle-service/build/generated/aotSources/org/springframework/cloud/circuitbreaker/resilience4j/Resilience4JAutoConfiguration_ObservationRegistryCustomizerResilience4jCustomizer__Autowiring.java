package org.springframework.cloud.circuitbreaker.resilience4j;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link Resilience4JAutoConfiguration.ObservationRegistryCustomizerResilience4jCustomizer}.
 */
public class Resilience4JAutoConfiguration_ObservationRegistryCustomizerResilience4jCustomizer__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static Resilience4JAutoConfiguration.ObservationRegistryCustomizerResilience4jCustomizer apply(
      RegisteredBean registeredBean,
      Resilience4JAutoConfiguration.ObservationRegistryCustomizerResilience4jCustomizer instance) {
    instance.observationRegistry = AutowiredFieldValueResolver.forRequiredField("observationRegistry").resolve(registeredBean);
    AutowiredFieldValueResolver.forField("factory").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
