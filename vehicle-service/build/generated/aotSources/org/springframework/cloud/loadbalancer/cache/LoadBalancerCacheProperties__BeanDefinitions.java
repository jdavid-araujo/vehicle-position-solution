package org.springframework.cloud.loadbalancer.cache;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LoadBalancerCacheProperties}.
 */
public class LoadBalancerCacheProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'loadBalancerCacheProperties'.
   */
  public static BeanDefinition getLoadBalancerCachePropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LoadBalancerCacheProperties.class);
    beanDefinition.setInstanceSupplier(LoadBalancerCacheProperties::new);
    return beanDefinition;
  }
}
