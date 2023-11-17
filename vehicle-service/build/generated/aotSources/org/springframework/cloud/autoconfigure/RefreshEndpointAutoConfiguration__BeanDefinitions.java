package org.springframework.cloud.autoconfigure;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.context.properties.ConfigurationPropertiesRebinder;
import org.springframework.cloud.health.RefreshScopeHealthIndicator;

/**
 * Bean definitions for {@link RefreshEndpointAutoConfiguration}.
 */
public class RefreshEndpointAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'refreshEndpointAutoConfiguration'.
   */
  public static BeanDefinition getRefreshEndpointAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RefreshEndpointAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(RefreshEndpointAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'refreshScopeHealthIndicator'.
   */
  private static BeanInstanceSupplier<RefreshScopeHealthIndicator> getRefreshScopeHealthIndicatorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RefreshScopeHealthIndicator>forFactoryMethod(RefreshEndpointAutoConfiguration.class, "refreshScopeHealthIndicator", ObjectProvider.class, ConfigurationPropertiesRebinder.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RefreshEndpointAutoConfiguration.class).refreshScopeHealthIndicator(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'refreshScopeHealthIndicator'.
   */
  public static BeanDefinition getRefreshScopeHealthIndicatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RefreshScopeHealthIndicator.class);
    beanDefinition.setInstanceSupplier(getRefreshScopeHealthIndicatorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link RefreshEndpointAutoConfiguration.RefreshEndpointConfiguration}.
   */
  public static class RefreshEndpointConfiguration {
    /**
     * Get the bean definition for 'refreshEndpointConfiguration'.
     */
    public static BeanDefinition getRefreshEndpointConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(RefreshEndpointAutoConfiguration.RefreshEndpointConfiguration.class);
      beanDefinition.setInstanceSupplier(RefreshEndpointAutoConfiguration.RefreshEndpointConfiguration::new);
      return beanDefinition;
    }
  }
}
