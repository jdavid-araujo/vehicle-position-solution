package io.github.resilience4j.springboot3.ratelimiter.autoconfigure;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link RateLimitersHealthIndicatorAutoConfiguration}.
 */
public class RateLimitersHealthIndicatorAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'rateLimitersHealthIndicatorAutoConfiguration'.
   */
  public static BeanDefinition getRateLimitersHealthIndicatorAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RateLimitersHealthIndicatorAutoConfiguration.class);
    beanDefinition.setTargetType(RateLimitersHealthIndicatorAutoConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(RateLimitersHealthIndicatorAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(RateLimitersHealthIndicatorAutoConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
