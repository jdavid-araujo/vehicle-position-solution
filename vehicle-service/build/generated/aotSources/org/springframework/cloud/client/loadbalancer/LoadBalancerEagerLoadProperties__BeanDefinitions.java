package org.springframework.cloud.client.loadbalancer;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LoadBalancerEagerLoadProperties}.
 */
public class LoadBalancerEagerLoadProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'loadBalancerEagerLoadProperties'.
   */
  public static BeanDefinition getLoadBalancerEagerLoadPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LoadBalancerEagerLoadProperties.class);
    beanDefinition.setInstanceSupplier(LoadBalancerEagerLoadProperties::new);
    return beanDefinition;
  }
}
