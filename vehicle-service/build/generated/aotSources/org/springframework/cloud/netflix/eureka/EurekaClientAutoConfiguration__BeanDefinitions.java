package org.springframework.cloud.netflix.eureka;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.EurekaInstanceConfig;
import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.EurekaClientConfig;
import com.netflix.discovery.shared.transport.jersey.TransportClientFactories;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.client.actuator.HasFeatures;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.metadata.ManagementMetadataProvider;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaAutoServiceRegistration;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaRegistration;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaServiceRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Bean definitions for {@link EurekaClientAutoConfiguration}.
 */
public class EurekaClientAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration'.
   */
  private static BeanInstanceSupplier<EurekaClientAutoConfiguration> getEurekaClientAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EurekaClientAutoConfiguration>forConstructor(ConfigurableEnvironment.class)
            .withGenerator((registeredBean, args) -> new EurekaClientAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'eurekaClientAutoConfiguration'.
   */
  public static BeanDefinition getEurekaClientAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaClientAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(getEurekaClientAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'eurekaFeature'.
   */
  private static BeanInstanceSupplier<HasFeatures> getEurekaFeatureInstanceSupplier() {
    return BeanInstanceSupplier.<HasFeatures>forFactoryMethod(EurekaClientAutoConfiguration.class, "eurekaFeature")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(EurekaClientAutoConfiguration.class).eurekaFeature());
  }

  /**
   * Get the bean definition for 'eurekaFeature'.
   */
  public static BeanDefinition getEurekaFeatureBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HasFeatures.class);
    beanDefinition.setInstanceSupplier(getEurekaFeatureInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'eurekaClientConfigBean'.
   */
  private static BeanInstanceSupplier<EurekaClientConfigBean> getEurekaClientConfigBeanInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EurekaClientConfigBean>forFactoryMethod(EurekaClientAutoConfiguration.class, "eurekaClientConfigBean", ConfigurableEnvironment.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EurekaClientAutoConfiguration.class).eurekaClientConfigBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'eurekaClientConfigBean'.
   */
  public static BeanDefinition getEurekaClientConfigBeanBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaClientConfigBean.class);
    InstanceSupplier<EurekaClientConfigBean> instanceSupplier = getEurekaClientConfigBeanInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(EurekaClientConfigBean__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'serviceManagementMetadataProvider'.
   */
  private static BeanInstanceSupplier<ManagementMetadataProvider> getServiceManagementMetadataProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ManagementMetadataProvider>forFactoryMethod(EurekaClientAutoConfiguration.class, "serviceManagementMetadataProvider")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(EurekaClientAutoConfiguration.class).serviceManagementMetadataProvider());
  }

  /**
   * Get the bean definition for 'serviceManagementMetadataProvider'.
   */
  public static BeanDefinition getServiceManagementMetadataProviderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ManagementMetadataProvider.class);
    beanDefinition.setInstanceSupplier(getServiceManagementMetadataProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'eurekaInstanceConfigBean'.
   */
  private static BeanInstanceSupplier<EurekaInstanceConfigBean> getEurekaInstanceConfigBeanInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EurekaInstanceConfigBean>forFactoryMethod(EurekaClientAutoConfiguration.class, "eurekaInstanceConfigBean", InetUtils.class, ManagementMetadataProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EurekaClientAutoConfiguration.class).eurekaInstanceConfigBean(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'eurekaInstanceConfigBean'.
   */
  public static BeanDefinition getEurekaInstanceConfigBeanBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaInstanceConfigBean.class);
    beanDefinition.setInstanceSupplier(getEurekaInstanceConfigBeanInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'eurekaServiceRegistry'.
   */
  private static BeanInstanceSupplier<EurekaServiceRegistry> getEurekaServiceRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EurekaServiceRegistry>forFactoryMethod(EurekaClientAutoConfiguration.class, "eurekaServiceRegistry")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(EurekaClientAutoConfiguration.class).eurekaServiceRegistry());
  }

  /**
   * Get the bean definition for 'eurekaServiceRegistry'.
   */
  public static BeanDefinition getEurekaServiceRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaServiceRegistry.class);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getEurekaServiceRegistryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'eurekaAutoServiceRegistration'.
   */
  private static BeanInstanceSupplier<EurekaAutoServiceRegistration> getEurekaAutoServiceRegistrationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EurekaAutoServiceRegistration>forFactoryMethod(EurekaClientAutoConfiguration.class, "eurekaAutoServiceRegistration", ApplicationContext.class, EurekaServiceRegistry.class, EurekaRegistration.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EurekaClientAutoConfiguration.class).eurekaAutoServiceRegistration(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'eurekaAutoServiceRegistration'.
   */
  public static BeanDefinition getEurekaAutoServiceRegistrationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaAutoServiceRegistration.class);
    beanDefinition.setInstanceSupplier(getEurekaAutoServiceRegistrationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link EurekaClientAutoConfiguration.EurekaHealthIndicatorConfiguration}.
   */
  public static class EurekaHealthIndicatorConfiguration {
    /**
     * Get the bean definition for 'eurekaHealthIndicatorConfiguration'.
     */
    public static BeanDefinition getEurekaHealthIndicatorConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaClientAutoConfiguration.EurekaHealthIndicatorConfiguration.class);
      beanDefinition.setInstanceSupplier(EurekaClientAutoConfiguration.EurekaHealthIndicatorConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'eurekaHealthIndicator'.
     */
    private static BeanInstanceSupplier<EurekaHealthIndicator> getEurekaHealthIndicatorInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<EurekaHealthIndicator>forFactoryMethod(EurekaClientAutoConfiguration.EurekaHealthIndicatorConfiguration.class, "eurekaHealthIndicator", EurekaClient.class, EurekaInstanceConfig.class, EurekaClientConfig.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EurekaClientAutoConfiguration.EurekaHealthIndicatorConfiguration.class).eurekaHealthIndicator(args.get(0), args.get(1), args.get(2)));
    }

    /**
     * Get the bean definition for 'eurekaHealthIndicator'.
     */
    public static BeanDefinition getEurekaHealthIndicatorBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaHealthIndicator.class);
      beanDefinition.setInstanceSupplier(getEurekaHealthIndicatorInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration}.
   */
  public static class RefreshableEurekaClientConfiguration {
    /**
     * Get the bean definition for 'refreshableEurekaClientConfiguration'.
     */
    public static BeanDefinition getRefreshableEurekaClientConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration.class);
      InstanceSupplier<EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration> instanceSupplier = InstanceSupplier.using(EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration::new);
      instanceSupplier = instanceSupplier.andThen(EurekaClientAutoConfiguration_RefreshableEurekaClientConfiguration__Autowiring::apply);
      beanDefinition.setInstanceSupplier(instanceSupplier);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'scopedTarget.eurekaClient'.
     */
    private static BeanInstanceSupplier<EurekaClient> getEurekaClientInstanceSupplier() {
      return BeanInstanceSupplier.<EurekaClient>forFactoryMethod(EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration.class, "eurekaClient", ApplicationInfoManager.class, EurekaClientConfig.class, EurekaInstanceConfig.class, TransportClientFactories.class, HealthCheckHandler.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration.class).eurekaClient(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
    }

    /**
     * Get the bean definition for 'eurekaClient'.
     */
    public static BeanDefinition getEurekaClientBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaClient.class);
      beanDefinition.setScope("refresh");
      beanDefinition.setAutowireCandidate(false);
      beanDefinition.setLazyInit(true);
      beanDefinition.setDestroyMethodNames("shutdown");
      beanDefinition.setInstanceSupplier(getEurekaClientInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'scopedTarget.eurekaApplicationInfoManager'.
     */
    private static BeanInstanceSupplier<ApplicationInfoManager> getEurekaApplicationInfoManagerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ApplicationInfoManager>forFactoryMethod(EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration.class, "eurekaApplicationInfoManager", EurekaInstanceConfig.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration.class).eurekaApplicationInfoManager(args.get(0)));
    }

    /**
     * Get the bean definition for 'eurekaApplicationInfoManager'.
     */
    public static BeanDefinition getEurekaApplicationInfoManagerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ApplicationInfoManager.class);
      beanDefinition.setScope("refresh");
      beanDefinition.setAutowireCandidate(false);
      beanDefinition.setLazyInit(true);
      beanDefinition.setInstanceSupplier(getEurekaApplicationInfoManagerInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'scopedTarget.eurekaRegistration'.
     */
    private static BeanInstanceSupplier<EurekaRegistration> getEurekaRegistrationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<EurekaRegistration>forFactoryMethod(EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration.class, "eurekaRegistration", EurekaClient.class, CloudEurekaInstanceConfig.class, ApplicationInfoManager.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EurekaClientAutoConfiguration.RefreshableEurekaClientConfiguration.class).eurekaRegistration(args.get(0), args.get(1), args.get(2), args.get(3)));
    }

    /**
     * Get the bean definition for 'eurekaRegistration'.
     */
    public static BeanDefinition getEurekaRegistrationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(EurekaRegistration.class);
      beanDefinition.setScope("refresh");
      beanDefinition.setAutowireCandidate(false);
      beanDefinition.setInstanceSupplier(getEurekaRegistrationInstanceSupplier());
      return beanDefinition;
    }
  }
}
