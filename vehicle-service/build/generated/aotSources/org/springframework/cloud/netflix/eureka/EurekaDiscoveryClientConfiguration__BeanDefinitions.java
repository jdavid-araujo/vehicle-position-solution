package org.springframework.cloud.netflix.eureka;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.EurekaClientConfig;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EurekaDiscoveryClientConfiguration}.
 */
public class EurekaDiscoveryClientConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'eurekaDiscoveryClientConfiguration'.
   */
  public static BeanDefinition getEurekaDiscoveryClientConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaDiscoveryClientConfiguration.class);
    beanDefinition.setInstanceSupplier(EurekaDiscoveryClientConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'discoveryClient'.
   */
  private static BeanInstanceSupplier<EurekaDiscoveryClient> getDiscoveryClientInstanceSupplier() {
    return BeanInstanceSupplier.<EurekaDiscoveryClient>forFactoryMethod(EurekaDiscoveryClientConfiguration.class, "discoveryClient", EurekaClient.class, EurekaClientConfig.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EurekaDiscoveryClientConfiguration.class).discoveryClient(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'discoveryClient'.
   */
  public static BeanDefinition getDiscoveryClientBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaDiscoveryClient.class);
    beanDefinition.setInstanceSupplier(getDiscoveryClientInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link EurekaDiscoveryClientConfiguration.EurekaClientConfigurationRefresher}.
   */
  public static class EurekaClientConfigurationRefresher {
    /**
     * Get the bean definition for 'eurekaClientConfigurationRefresher'.
     */
    public static BeanDefinition getEurekaClientConfigurationRefresherBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaDiscoveryClientConfiguration.EurekaClientConfigurationRefresher.class);
      InstanceSupplier<EurekaDiscoveryClientConfiguration.EurekaClientConfigurationRefresher> instanceSupplier = InstanceSupplier.using(EurekaDiscoveryClientConfiguration.EurekaClientConfigurationRefresher::new);
      instanceSupplier = instanceSupplier.andThen(EurekaDiscoveryClientConfiguration_EurekaClientConfigurationRefresher__Autowiring::apply);
      beanDefinition.setInstanceSupplier(instanceSupplier);
      return beanDefinition;
    }
  }
}
