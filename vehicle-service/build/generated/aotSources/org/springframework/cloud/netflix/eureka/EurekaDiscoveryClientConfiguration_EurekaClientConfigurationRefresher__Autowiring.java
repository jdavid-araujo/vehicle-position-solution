package org.springframework.cloud.netflix.eureka;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EurekaDiscoveryClientConfiguration.EurekaClientConfigurationRefresher}.
 */
public class EurekaDiscoveryClientConfiguration_EurekaClientConfigurationRefresher__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EurekaDiscoveryClientConfiguration.EurekaClientConfigurationRefresher apply(
      RegisteredBean registeredBean,
      EurekaDiscoveryClientConfiguration.EurekaClientConfigurationRefresher instance) {
    AutowiredFieldValueResolver.forField("eurekaClient").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forField("autoRegistration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
