package org.springframework.cloud.circuitbreaker.resilience4j;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link Resilience4JConfigurationProperties}.
 */
public class Resilience4JConfigurationProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'resilience4JConfigurationProperties'.
   */
  public static BeanDefinition getResilienceJConfigurationPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Resilience4JConfigurationProperties.class);
    beanDefinition.setInstanceSupplier(Resilience4JConfigurationProperties::new);
    return beanDefinition;
  }
}
