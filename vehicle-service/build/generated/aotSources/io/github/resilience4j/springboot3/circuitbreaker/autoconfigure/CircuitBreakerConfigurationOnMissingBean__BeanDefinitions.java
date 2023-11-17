package io.github.resilience4j.springboot3.circuitbreaker.autoconfigure;

import io.github.resilience4j.circuitbreaker.event.CircuitBreakerEvent;
import io.github.resilience4j.consumer.EventConsumerRegistry;
import io.github.resilience4j.spring6.circuitbreaker.configure.CircuitBreakerConfigurationProperties;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link CircuitBreakerConfigurationOnMissingBean}.
 */
public class CircuitBreakerConfigurationOnMissingBean__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'io.github.resilience4j.springboot3.circuitbreaker.autoconfigure.CircuitBreakerConfigurationOnMissingBean'.
   */
  private static BeanInstanceSupplier<CircuitBreakerConfigurationOnMissingBean> getCircuitBreakerConfigurationOnMissingBeanInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CircuitBreakerConfigurationOnMissingBean>forConstructor(CircuitBreakerConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> new CircuitBreakerConfigurationOnMissingBean$$SpringCGLIB$$0(args.get(0)));
  }

  /**
   * Get the bean definition for 'circuitBreakerConfigurationOnMissingBean'.
   */
  public static BeanDefinition getCircuitBreakerConfigurationOnMissingBeanBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CircuitBreakerConfigurationOnMissingBean.class);
    beanDefinition.setTargetType(CircuitBreakerConfigurationOnMissingBean.class);
    ConfigurationClassUtils.initializeConfigurationClass(CircuitBreakerConfigurationOnMissingBean.class);
    beanDefinition.setInstanceSupplier(getCircuitBreakerConfigurationOnMissingBeanInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'eventConsumerRegistry'.
   */
  private static BeanInstanceSupplier<EventConsumerRegistry> getEventConsumerRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EventConsumerRegistry>forFactoryMethod(CircuitBreakerConfigurationOnMissingBean.class, "eventConsumerRegistry")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CircuitBreakerConfigurationOnMissingBean.class).eventConsumerRegistry());
  }

  /**
   * Get the bean definition for 'eventConsumerRegistry'.
   */
  public static BeanDefinition getEventConsumerRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EventConsumerRegistry.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(EventConsumerRegistry.class, CircuitBreakerEvent.class));
    beanDefinition.setInstanceSupplier(getEventConsumerRegistryInstanceSupplier());
    return beanDefinition;
  }
}
