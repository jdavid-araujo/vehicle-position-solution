package io.github.resilience4j.springboot3.circuitbreaker.autoconfigure;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link CircuitBreakersHealthIndicatorAutoConfiguration}.
 */
public class CircuitBreakersHealthIndicatorAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'circuitBreakersHealthIndicatorAutoConfiguration'.
   */
  public static BeanDefinition getCircuitBreakersHealthIndicatorAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CircuitBreakersHealthIndicatorAutoConfiguration.class);
    beanDefinition.setTargetType(CircuitBreakersHealthIndicatorAutoConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(CircuitBreakersHealthIndicatorAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CircuitBreakersHealthIndicatorAutoConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
