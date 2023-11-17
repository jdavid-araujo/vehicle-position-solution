package org.springframework.cloud.netflix.eureka.loadbalancer;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LoadBalancerEurekaAutoConfiguration}.
 */
public class LoadBalancerEurekaAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'loadBalancerEurekaAutoConfiguration'.
   */
  public static BeanDefinition getLoadBalancerEurekaAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LoadBalancerEurekaAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(LoadBalancerEurekaAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'eurekaLoadBalancerProperties'.
   */
  private static BeanInstanceSupplier<EurekaLoadBalancerProperties> getEurekaLoadBalancerPropertiesInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EurekaLoadBalancerProperties>forFactoryMethod(LoadBalancerEurekaAutoConfiguration.class, "eurekaLoadBalancerProperties")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(LoadBalancerEurekaAutoConfiguration.class).eurekaLoadBalancerProperties());
  }

  /**
   * Get the bean definition for 'eurekaLoadBalancerProperties'.
   */
  public static BeanDefinition getEurekaLoadBalancerPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaLoadBalancerProperties.class);
    beanDefinition.setInstanceSupplier(getEurekaLoadBalancerPropertiesInstanceSupplier());
    return beanDefinition;
  }
}
