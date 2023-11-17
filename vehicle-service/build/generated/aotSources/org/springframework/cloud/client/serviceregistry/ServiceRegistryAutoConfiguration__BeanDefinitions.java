package org.springframework.cloud.client.serviceregistry;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ServiceRegistryAutoConfiguration}.
 */
public class ServiceRegistryAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'serviceRegistryAutoConfiguration'.
   */
  public static BeanDefinition getServiceRegistryAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServiceRegistryAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(ServiceRegistryAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ServiceRegistryAutoConfiguration.ServiceRegistryEndpointConfiguration}.
   */
  public static class ServiceRegistryEndpointConfiguration {
    /**
     * Get the bean instance supplier for 'org.springframework.cloud.client.serviceregistry.ServiceRegistryAutoConfiguration$ServiceRegistryEndpointConfiguration'.
     */
    private static BeanInstanceSupplier<ServiceRegistryAutoConfiguration.ServiceRegistryEndpointConfiguration> getServiceRegistryEndpointConfigurationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ServiceRegistryAutoConfiguration.ServiceRegistryEndpointConfiguration>forConstructor()
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ServiceRegistryAutoConfiguration.class).new ServiceRegistryEndpointConfiguration());
    }

    /**
     * Get the bean definition for 'serviceRegistryEndpointConfiguration'.
     */
    public static BeanDefinition getServiceRegistryEndpointConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ServiceRegistryAutoConfiguration.ServiceRegistryEndpointConfiguration.class);
      InstanceSupplier<ServiceRegistryAutoConfiguration.ServiceRegistryEndpointConfiguration> instanceSupplier = getServiceRegistryEndpointConfigurationInstanceSupplier();
      instanceSupplier = instanceSupplier.andThen(ServiceRegistryAutoConfiguration_ServiceRegistryEndpointConfiguration__Autowiring::apply);
      beanDefinition.setInstanceSupplier(instanceSupplier);
      return beanDefinition;
    }
  }
}
