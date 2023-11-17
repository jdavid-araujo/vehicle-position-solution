package org.springframework.cloud.netflix.eureka;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration}.
 */
public class EurekaClientAutoConfiguration_RefreshableEurekaClientConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration apply(
      RegisteredBean registeredBean,
      EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("context").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("optionalArgs").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
