package org.springframework.cloud.netflix.eureka.config;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.configuration.TlsProperties;
import org.springframework.cloud.netflix.eureka.RestTemplateTimeoutProperties;
import org.springframework.cloud.netflix.eureka.http.EurekaClientHttpRequestFactorySupplier;
import org.springframework.cloud.netflix.eureka.http.RestTemplateDiscoveryClientOptionalArgs;
import org.springframework.cloud.netflix.eureka.http.RestTemplateTransportClientFactories;

/**
 * Bean definitions for {@link DiscoveryClientOptionalArgsConfiguration}.
 */
public class DiscoveryClientOptionalArgsConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'discoveryClientOptionalArgsConfiguration'.
   */
  public static BeanDefinition getDiscoveryClientOptionalArgsConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DiscoveryClientOptionalArgsConfiguration.class);
    beanDefinition.setInstanceSupplier(DiscoveryClientOptionalArgsConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'tlsProperties'.
   */
  private static BeanInstanceSupplier<TlsProperties> getTlsPropertiesInstanceSupplier() {
    return BeanInstanceSupplier.<TlsProperties>forFactoryMethod(DiscoveryClientOptionalArgsConfiguration.class, "tlsProperties")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(DiscoveryClientOptionalArgsConfiguration.class).tlsProperties());
  }

  /**
   * Get the bean definition for 'tlsProperties'.
   */
  public static BeanDefinition getTlsPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TlsProperties.class);
    beanDefinition.setInstanceSupplier(getTlsPropertiesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'restTemplateDiscoveryClientOptionalArgs'.
   */
  private static BeanInstanceSupplier<RestTemplateDiscoveryClientOptionalArgs> getRestTemplateDiscoveryClientOptionalArgsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RestTemplateDiscoveryClientOptionalArgs>forFactoryMethod(DiscoveryClientOptionalArgsConfiguration.class, "restTemplateDiscoveryClientOptionalArgs", TlsProperties.class, EurekaClientHttpRequestFactorySupplier.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(DiscoveryClientOptionalArgsConfiguration.class).restTemplateDiscoveryClientOptionalArgs(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'restTemplateDiscoveryClientOptionalArgs'.
   */
  public static BeanDefinition getRestTemplateDiscoveryClientOptionalArgsBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestTemplateDiscoveryClientOptionalArgs.class);
    beanDefinition.setInstanceSupplier(getRestTemplateDiscoveryClientOptionalArgsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'restTemplateTransportClientFactories'.
   */
  private static BeanInstanceSupplier<RestTemplateTransportClientFactories> getRestTemplateTransportClientFactoriesInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RestTemplateTransportClientFactories>forFactoryMethod(DiscoveryClientOptionalArgsConfiguration.class, "restTemplateTransportClientFactories", RestTemplateDiscoveryClientOptionalArgs.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(DiscoveryClientOptionalArgsConfiguration.class).restTemplateTransportClientFactories(args.get(0)));
  }

  /**
   * Get the bean definition for 'restTemplateTransportClientFactories'.
   */
  public static BeanDefinition getRestTemplateTransportClientFactoriesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestTemplateTransportClientFactories.class);
    beanDefinition.setInstanceSupplier(getRestTemplateTransportClientFactoriesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultEurekaClientHttpRequestFactorySupplier'.
   */
  private static BeanInstanceSupplier<EurekaClientHttpRequestFactorySupplier> getDefaultEurekaClientHttpRequestFactorySupplierInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EurekaClientHttpRequestFactorySupplier>forFactoryMethod(DiscoveryClientOptionalArgsConfiguration.class, "defaultEurekaClientHttpRequestFactorySupplier", RestTemplateTimeoutProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(DiscoveryClientOptionalArgsConfiguration.class).defaultEurekaClientHttpRequestFactorySupplier(args.get(0)));
  }

  /**
   * Get the bean definition for 'defaultEurekaClientHttpRequestFactorySupplier'.
   */
  public static BeanDefinition getDefaultEurekaClientHttpRequestFactorySupplierBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaClientHttpRequestFactorySupplier.class);
    beanDefinition.setInstanceSupplier(getDefaultEurekaClientHttpRequestFactorySupplierInstanceSupplier());
    return beanDefinition;
  }
}
