package org.springframework.cloud.circuitbreaker.resilience4j;

import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.timelimiter.TimeLimiterRegistry;
import io.micrometer.core.instrument.config.MeterFilter;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link Resilience4JAutoConfiguration}.
 */
public class Resilience4JAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'resilience4JAutoConfiguration'.
   */
  public static BeanDefinition getResilienceJAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Resilience4JAutoConfiguration.class);
    InstanceSupplier<Resilience4JAutoConfiguration> instanceSupplier = InstanceSupplier.using(Resilience4JAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(Resilience4JAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'resilience4jCircuitBreakerFactory'.
   */
  private static BeanInstanceSupplier<Resilience4JCircuitBreakerFactory> getResiliencejCircuitBreakerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<Resilience4JCircuitBreakerFactory>forFactoryMethod(Resilience4JAutoConfiguration.class, "resilience4jCircuitBreakerFactory", CircuitBreakerRegistry.class, TimeLimiterRegistry.class, Resilience4jBulkheadProvider.class, Resilience4JConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(Resilience4JAutoConfiguration.class).resilience4jCircuitBreakerFactory(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'resilience4jCircuitBreakerFactory'.
   */
  public static BeanDefinition getResiliencejCircuitBreakerFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Resilience4JCircuitBreakerFactory.class);
    beanDefinition.setInstanceSupplier(getResiliencejCircuitBreakerFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link Resilience4JAutoConfiguration.MicrometerResilience4JGroupCustomizerConfiguration}.
   */
  public static class MicrometerResilience4JGroupCustomizerConfiguration {
    /**
     * Get the bean definition for 'micrometerResilience4JGroupCustomizerConfiguration'.
     */
    public static BeanDefinition getMicrometerResilienceJGroupCustomizerConfigurationBeanDefinition(
        ) {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(Resilience4JAutoConfiguration.MicrometerResilience4JGroupCustomizerConfiguration.class);
      beanDefinition.setInstanceSupplier(Resilience4JAutoConfiguration.MicrometerResilience4JGroupCustomizerConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'resilience4JMeterFilter'.
     */
    private static BeanInstanceSupplier<MeterFilter> getResilienceJMeterFilterInstanceSupplier() {
      return BeanInstanceSupplier.<MeterFilter>forFactoryMethod(Resilience4JAutoConfiguration.MicrometerResilience4JGroupCustomizerConfiguration.class, "resilience4JMeterFilter", Resilience4JConfigurationProperties.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(Resilience4JAutoConfiguration.MicrometerResilience4JGroupCustomizerConfiguration.class).resilience4JMeterFilter(args.get(0)));
    }

    /**
     * Get the bean definition for 'resilience4JMeterFilter'.
     */
    public static BeanDefinition getResilienceJMeterFilterBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MeterFilter.class);
      beanDefinition.setInstanceSupplier(getResilienceJMeterFilterInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link Resilience4JAutoConfiguration.ObservationRegistryCustomizerResilience4jCustomizer}.
   */
  public static class ObservationRegistryCustomizerResilience4jCustomizer {
    /**
     * Get the bean definition for 'observationRegistryCustomizerResilience4jCustomizer'.
     */
    public static BeanDefinition getObservationRegistryCustomizerResiliencejCustomizerBeanDefinition(
        ) {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(Resilience4JAutoConfiguration.ObservationRegistryCustomizerResilience4jCustomizer.class);
      beanDefinition.setInitMethodNames("init");
      InstanceSupplier<Resilience4JAutoConfiguration.ObservationRegistryCustomizerResilience4jCustomizer> instanceSupplier = InstanceSupplier.using(Resilience4JAutoConfiguration.ObservationRegistryCustomizerResilience4jCustomizer::new);
      instanceSupplier = instanceSupplier.andThen(Resilience4JAutoConfiguration_ObservationRegistryCustomizerResilience4jCustomizer__Autowiring::apply);
      beanDefinition.setInstanceSupplier(instanceSupplier);
      return beanDefinition;
    }
  }
}
