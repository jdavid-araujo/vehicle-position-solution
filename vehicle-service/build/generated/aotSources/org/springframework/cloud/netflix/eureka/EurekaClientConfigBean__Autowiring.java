package org.springframework.cloud.netflix.eureka;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EurekaClientConfigBean}.
 */
public class EurekaClientConfigBean__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EurekaClientConfigBean apply(RegisteredBean registeredBean,
      EurekaClientConfigBean instance) {
    instance.propertyResolver = AutowiredFieldValueResolver.forField("propertyResolver").resolve(registeredBean);
    return instance;
  }
}
