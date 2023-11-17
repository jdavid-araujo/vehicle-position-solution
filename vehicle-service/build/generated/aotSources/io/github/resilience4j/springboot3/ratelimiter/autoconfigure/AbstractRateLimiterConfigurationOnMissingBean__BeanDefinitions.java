package io.github.resilience4j.springboot3.ratelimiter.autoconfigure;

import io.github.resilience4j.common.CompositeCustomizer;
import io.github.resilience4j.common.ratelimiter.configuration.RateLimiterConfigCustomizer;
import io.github.resilience4j.consumer.EventConsumerRegistry;
import io.github.resilience4j.core.registry.RegistryEventConsumer;
import io.github.resilience4j.ratelimiter.RateLimiter;
import io.github.resilience4j.ratelimiter.RateLimiterRegistry;
import io.github.resilience4j.spring6.fallback.FallbackExecutor;
import io.github.resilience4j.spring6.ratelimiter.configure.RateLimiterAspect;
import io.github.resilience4j.spring6.ratelimiter.configure.RateLimiterConfigurationProperties;
import io.github.resilience4j.spring6.spelresolver.SpelResolver;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link AbstractRateLimiterConfigurationOnMissingBean}.
 */
public class AbstractRateLimiterConfigurationOnMissingBean__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'compositeRateLimiterCustomizer'.
   */
  private static BeanInstanceSupplier<CompositeCustomizer> getCompositeRateLimiterCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CompositeCustomizer>forFactoryMethod(AbstractRateLimiterConfigurationOnMissingBean.class, "compositeRateLimiterCustomizer", List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractRateLimiterConfigurationOnMissingBean.class).compositeRateLimiterCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'compositeRateLimiterCustomizer'.
   */
  public static BeanDefinition getCompositeRateLimiterCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CompositeCustomizer.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(CompositeCustomizer.class, RateLimiterConfigCustomizer.class));
    beanDefinition.setInstanceSupplier(getCompositeRateLimiterCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'rateLimiterRegistry'.
   */
  private static BeanInstanceSupplier<RateLimiterRegistry> getRateLimiterRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RateLimiterRegistry>forFactoryMethod(AbstractRateLimiterConfigurationOnMissingBean.class, "rateLimiterRegistry", RateLimiterConfigurationProperties.class, EventConsumerRegistry.class, RegistryEventConsumer.class, CompositeCustomizer.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractRateLimiterConfigurationOnMissingBean.class).rateLimiterRegistry(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'rateLimiterRegistry'.
   */
  public static BeanDefinition getRateLimiterRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RateLimiterRegistry.class);
    beanDefinition.setInstanceSupplier(getRateLimiterRegistryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'rateLimiterRegistryEventConsumer'.
   */
  private static BeanInstanceSupplier<RegistryEventConsumer> getRateLimiterRegistryEventConsumerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RegistryEventConsumer>forFactoryMethod(AbstractRateLimiterConfigurationOnMissingBean.class, "rateLimiterRegistryEventConsumer", Optional.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractRateLimiterConfigurationOnMissingBean.class).rateLimiterRegistryEventConsumer(args.get(0)));
  }

  /**
   * Get the bean definition for 'rateLimiterRegistryEventConsumer'.
   */
  public static BeanDefinition getRateLimiterRegistryEventConsumerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RegistryEventConsumer.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(RegistryEventConsumer.class, RateLimiter.class));
    beanDefinition.setPrimary(true);
    beanDefinition.setInstanceSupplier(getRateLimiterRegistryEventConsumerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'rateLimiterAspect'.
   */
  private static BeanInstanceSupplier<RateLimiterAspect> getRateLimiterAspectInstanceSupplier() {
    return BeanInstanceSupplier.<RateLimiterAspect>forFactoryMethod(AbstractRateLimiterConfigurationOnMissingBean.class, "rateLimiterAspect", RateLimiterConfigurationProperties.class, RateLimiterRegistry.class, List.class, FallbackExecutor.class, SpelResolver.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractRateLimiterConfigurationOnMissingBean.class).rateLimiterAspect(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'rateLimiterAspect'.
   */
  public static BeanDefinition getRateLimiterAspectBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RateLimiterAspect.class);
    beanDefinition.setInstanceSupplier(getRateLimiterAspectInstanceSupplier());
    return beanDefinition;
  }
}
