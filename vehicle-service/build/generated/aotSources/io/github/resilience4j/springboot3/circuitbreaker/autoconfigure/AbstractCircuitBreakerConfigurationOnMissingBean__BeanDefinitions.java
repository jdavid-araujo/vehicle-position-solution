package io.github.resilience4j.springboot3.circuitbreaker.autoconfigure;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.common.CompositeCustomizer;
import io.github.resilience4j.common.circuitbreaker.configuration.CircuitBreakerConfigCustomizer;
import io.github.resilience4j.consumer.EventConsumerRegistry;
import io.github.resilience4j.core.registry.RegistryEventConsumer;
import io.github.resilience4j.spring6.circuitbreaker.configure.CircuitBreakerAspect;
import io.github.resilience4j.spring6.fallback.FallbackExecutor;
import io.github.resilience4j.spring6.spelresolver.SpelResolver;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link AbstractCircuitBreakerConfigurationOnMissingBean}.
 */
public class AbstractCircuitBreakerConfigurationOnMissingBean__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'compositeCircuitBreakerCustomizer'.
   */
  private static BeanInstanceSupplier<CompositeCustomizer> getCompositeCircuitBreakerCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CompositeCustomizer>forFactoryMethod(AbstractCircuitBreakerConfigurationOnMissingBean.class, "compositeCircuitBreakerCustomizer", List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractCircuitBreakerConfigurationOnMissingBean.class).compositeCircuitBreakerCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'compositeCircuitBreakerCustomizer'.
   */
  public static BeanDefinition getCompositeCircuitBreakerCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CompositeCustomizer.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(CompositeCustomizer.class, CircuitBreakerConfigCustomizer.class));
    beanDefinition.setInstanceSupplier(getCompositeCircuitBreakerCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'circuitBreakerRegistry'.
   */
  private static BeanInstanceSupplier<CircuitBreakerRegistry> getCircuitBreakerRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CircuitBreakerRegistry>forFactoryMethod(AbstractCircuitBreakerConfigurationOnMissingBean.class, "circuitBreakerRegistry", EventConsumerRegistry.class, RegistryEventConsumer.class, CompositeCustomizer.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractCircuitBreakerConfigurationOnMissingBean.class).circuitBreakerRegistry(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'circuitBreakerRegistry'.
   */
  public static BeanDefinition getCircuitBreakerRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CircuitBreakerRegistry.class);
    beanDefinition.setInstanceSupplier(getCircuitBreakerRegistryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'circuitBreakerRegistryEventConsumer'.
   */
  private static BeanInstanceSupplier<RegistryEventConsumer> getCircuitBreakerRegistryEventConsumerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RegistryEventConsumer>forFactoryMethod(AbstractCircuitBreakerConfigurationOnMissingBean.class, "circuitBreakerRegistryEventConsumer", Optional.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractCircuitBreakerConfigurationOnMissingBean.class).circuitBreakerRegistryEventConsumer(args.get(0)));
  }

  /**
   * Get the bean definition for 'circuitBreakerRegistryEventConsumer'.
   */
  public static BeanDefinition getCircuitBreakerRegistryEventConsumerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RegistryEventConsumer.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(RegistryEventConsumer.class, CircuitBreaker.class));
    beanDefinition.setPrimary(true);
    beanDefinition.setInstanceSupplier(getCircuitBreakerRegistryEventConsumerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'circuitBreakerAspect'.
   */
  private static BeanInstanceSupplier<CircuitBreakerAspect> getCircuitBreakerAspectInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CircuitBreakerAspect>forFactoryMethod(AbstractCircuitBreakerConfigurationOnMissingBean.class, "circuitBreakerAspect", CircuitBreakerRegistry.class, List.class, FallbackExecutor.class, SpelResolver.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractCircuitBreakerConfigurationOnMissingBean.class).circuitBreakerAspect(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'circuitBreakerAspect'.
   */
  public static BeanDefinition getCircuitBreakerAspectBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CircuitBreakerAspect.class);
    beanDefinition.setInstanceSupplier(getCircuitBreakerAspectInstanceSupplier());
    return beanDefinition;
  }
}
