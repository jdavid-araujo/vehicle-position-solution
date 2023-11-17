package org.springframework.cloud.openfeign.loadbalancer;

import feign.Client;
import java.util.List;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;

/**
 * Bean definitions for {@link DefaultFeignLoadBalancerConfiguration}.
 */
public class DefaultFeignLoadBalancerConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'defaultFeignLoadBalancerConfiguration'.
   */
  public static BeanDefinition getDefaultFeignLoadBalancerConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultFeignLoadBalancerConfiguration.class);
    beanDefinition.setInstanceSupplier(DefaultFeignLoadBalancerConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'feignClient'.
   */
  private static BeanInstanceSupplier<Client> getFeignClientInstanceSupplier() {
    return BeanInstanceSupplier.<Client>forFactoryMethod(DefaultFeignLoadBalancerConfiguration.class, "feignClient", LoadBalancerClient.class, LoadBalancerClientFactory.class, List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(DefaultFeignLoadBalancerConfiguration.class).feignClient(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'feignClient'.
   */
  public static BeanDefinition getFeignClientBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Client.class);
    beanDefinition.setInstanceSupplier(getFeignClientInstanceSupplier());
    return beanDefinition;
  }
}
