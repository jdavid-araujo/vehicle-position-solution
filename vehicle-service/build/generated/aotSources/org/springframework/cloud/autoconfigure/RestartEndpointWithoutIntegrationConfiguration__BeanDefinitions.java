package org.springframework.cloud.autoconfigure;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestartEndpointWithoutIntegrationConfiguration}.
 */
public class RestartEndpointWithoutIntegrationConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'restartEndpointWithoutIntegrationConfiguration'.
   */
  public static BeanDefinition getRestartEndpointWithoutIntegrationConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestartEndpointWithoutIntegrationConfiguration.class);
    beanDefinition.setInstanceSupplier(RestartEndpointWithoutIntegrationConfiguration::new);
    return beanDefinition;
  }
}
