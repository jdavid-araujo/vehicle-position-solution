package org.springframework.cloud.client.loadbalancer;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LoadBalancerAutoConfiguration}.
 */
public class LoadBalancerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'loadBalancerAutoConfiguration'.
   */
  public static BeanDefinition getLoadBalancerAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LoadBalancerAutoConfiguration.class);
    InstanceSupplier<LoadBalancerAutoConfiguration> instanceSupplier = InstanceSupplier.using(LoadBalancerAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(LoadBalancerAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'loadBalancedRestTemplateInitializerDeprecated'.
   */
  private static BeanInstanceSupplier<SmartInitializingSingleton> getLoadBalancedRestTemplateInitializerDeprecatedInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SmartInitializingSingleton>forFactoryMethod(LoadBalancerAutoConfiguration.class, "loadBalancedRestTemplateInitializerDeprecated", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(LoadBalancerAutoConfiguration.class).loadBalancedRestTemplateInitializerDeprecated(args.get(0)));
  }

  /**
   * Get the bean definition for 'loadBalancedRestTemplateInitializerDeprecated'.
   */
  public static BeanDefinition getLoadBalancedRestTemplateInitializerDeprecatedBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SmartInitializingSingleton.class);
    beanDefinition.setInstanceSupplier(getLoadBalancedRestTemplateInitializerDeprecatedInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'loadBalancerRequestFactory'.
   */
  private static BeanInstanceSupplier<LoadBalancerRequestFactory> getLoadBalancerRequestFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LoadBalancerRequestFactory>forFactoryMethod(LoadBalancerAutoConfiguration.class, "loadBalancerRequestFactory", LoadBalancerClient.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(LoadBalancerAutoConfiguration.class).loadBalancerRequestFactory(args.get(0)));
  }

  /**
   * Get the bean definition for 'loadBalancerRequestFactory'.
   */
  public static BeanDefinition getLoadBalancerRequestFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LoadBalancerRequestFactory.class);
    beanDefinition.setInstanceSupplier(getLoadBalancerRequestFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link LoadBalancerAutoConfiguration.LoadBalancerInterceptorConfig}.
   */
  public static class LoadBalancerInterceptorConfig {
    /**
     * Get the bean definition for 'loadBalancerInterceptorConfig'.
     */
    public static BeanDefinition getLoadBalancerInterceptorConfigBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(LoadBalancerAutoConfiguration.LoadBalancerInterceptorConfig.class);
      beanDefinition.setInstanceSupplier(LoadBalancerAutoConfiguration.LoadBalancerInterceptorConfig::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'loadBalancerInterceptor'.
     */
    private static BeanInstanceSupplier<LoadBalancerInterceptor> getLoadBalancerInterceptorInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<LoadBalancerInterceptor>forFactoryMethod(LoadBalancerAutoConfiguration.LoadBalancerInterceptorConfig.class, "loadBalancerInterceptor", LoadBalancerClient.class, LoadBalancerRequestFactory.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(LoadBalancerAutoConfiguration.LoadBalancerInterceptorConfig.class).loadBalancerInterceptor(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'loadBalancerInterceptor'.
     */
    public static BeanDefinition getLoadBalancerInterceptorBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(LoadBalancerInterceptor.class);
      beanDefinition.setInstanceSupplier(getLoadBalancerInterceptorInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'restTemplateCustomizer'.
     */
    private static BeanInstanceSupplier<RestTemplateCustomizer> getRestTemplateCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<RestTemplateCustomizer>forFactoryMethod(LoadBalancerAutoConfiguration.LoadBalancerInterceptorConfig.class, "restTemplateCustomizer", LoadBalancerInterceptor.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(LoadBalancerAutoConfiguration.LoadBalancerInterceptorConfig.class).restTemplateCustomizer(args.get(0)));
    }

    /**
     * Get the bean definition for 'restTemplateCustomizer'.
     */
    public static BeanDefinition getRestTemplateCustomizerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(RestTemplateCustomizer.class);
      beanDefinition.setInstanceSupplier(getRestTemplateCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }
}
