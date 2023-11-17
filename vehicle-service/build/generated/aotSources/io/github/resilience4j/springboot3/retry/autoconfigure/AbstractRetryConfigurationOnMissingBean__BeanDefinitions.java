package io.github.resilience4j.springboot3.retry.autoconfigure;

import io.github.resilience4j.common.CompositeCustomizer;
import io.github.resilience4j.common.retry.configuration.RetryConfigCustomizer;
import io.github.resilience4j.consumer.EventConsumerRegistry;
import io.github.resilience4j.core.ContextAwareScheduledThreadPoolExecutor;
import io.github.resilience4j.core.registry.RegistryEventConsumer;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryRegistry;
import io.github.resilience4j.spring6.fallback.FallbackExecutor;
import io.github.resilience4j.spring6.retry.configure.RetryAspect;
import io.github.resilience4j.spring6.retry.configure.RetryConfigurationProperties;
import io.github.resilience4j.spring6.spelresolver.SpelResolver;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link AbstractRetryConfigurationOnMissingBean}.
 */
public class AbstractRetryConfigurationOnMissingBean__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'compositeRetryCustomizer'.
   */
  private static BeanInstanceSupplier<CompositeCustomizer> getCompositeRetryCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CompositeCustomizer>forFactoryMethod(AbstractRetryConfigurationOnMissingBean.class, "compositeRetryCustomizer", List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractRetryConfigurationOnMissingBean.class).compositeRetryCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'compositeRetryCustomizer'.
   */
  public static BeanDefinition getCompositeRetryCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CompositeCustomizer.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(CompositeCustomizer.class, RetryConfigCustomizer.class));
    beanDefinition.setInstanceSupplier(getCompositeRetryCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'retryRegistry'.
   */
  private static BeanInstanceSupplier<RetryRegistry> getRetryRegistryInstanceSupplier() {
    return BeanInstanceSupplier.<RetryRegistry>forFactoryMethod(AbstractRetryConfigurationOnMissingBean.class, "retryRegistry", RetryConfigurationProperties.class, EventConsumerRegistry.class, RegistryEventConsumer.class, CompositeCustomizer.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractRetryConfigurationOnMissingBean.class).retryRegistry(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'retryRegistry'.
   */
  public static BeanDefinition getRetryRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RetryRegistry.class);
    beanDefinition.setInstanceSupplier(getRetryRegistryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'retryRegistryEventConsumer'.
   */
  private static BeanInstanceSupplier<RegistryEventConsumer> getRetryRegistryEventConsumerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RegistryEventConsumer>forFactoryMethod(AbstractRetryConfigurationOnMissingBean.class, "retryRegistryEventConsumer", Optional.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractRetryConfigurationOnMissingBean.class).retryRegistryEventConsumer(args.get(0)));
  }

  /**
   * Get the bean definition for 'retryRegistryEventConsumer'.
   */
  public static BeanDefinition getRetryRegistryEventConsumerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RegistryEventConsumer.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(RegistryEventConsumer.class, Retry.class));
    beanDefinition.setPrimary(true);
    beanDefinition.setInstanceSupplier(getRetryRegistryEventConsumerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'retryAspect'.
   */
  private static BeanInstanceSupplier<RetryAspect> getRetryAspectInstanceSupplier() {
    return BeanInstanceSupplier.<RetryAspect>forFactoryMethod(AbstractRetryConfigurationOnMissingBean.class, "retryAspect", RetryConfigurationProperties.class, RetryRegistry.class, List.class, FallbackExecutor.class, SpelResolver.class, ContextAwareScheduledThreadPoolExecutor.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AbstractRetryConfigurationOnMissingBean.class).retryAspect(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5)));
  }

  /**
   * Get the bean definition for 'retryAspect'.
   */
  public static BeanDefinition getRetryAspectBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RetryAspect.class);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getRetryAspectInstanceSupplier());
    return beanDefinition;
  }
}
