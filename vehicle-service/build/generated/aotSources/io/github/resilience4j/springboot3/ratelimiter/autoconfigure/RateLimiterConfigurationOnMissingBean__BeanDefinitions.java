package io.github.resilience4j.springboot3.ratelimiter.autoconfigure;

import io.github.resilience4j.consumer.EventConsumerRegistry;
import io.github.resilience4j.ratelimiter.event.RateLimiterEvent;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link RateLimiterConfigurationOnMissingBean}.
 */
public class RateLimiterConfigurationOnMissingBean__BeanDefinitions {
  /**
   * Get the bean definition for 'rateLimiterConfigurationOnMissingBean'.
   */
  public static BeanDefinition getRateLimiterConfigurationOnMissingBeanBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RateLimiterConfigurationOnMissingBean.class);
    beanDefinition.setTargetType(RateLimiterConfigurationOnMissingBean.class);
    ConfigurationClassUtils.initializeConfigurationClass(RateLimiterConfigurationOnMissingBean.class);
    beanDefinition.setInstanceSupplier(RateLimiterConfigurationOnMissingBean$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'rateLimiterEventsConsumerRegistry'.
   */
  private static BeanInstanceSupplier<EventConsumerRegistry> getRateLimiterEventsConsumerRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EventConsumerRegistry>forFactoryMethod(RateLimiterConfigurationOnMissingBean.class, "rateLimiterEventsConsumerRegistry")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RateLimiterConfigurationOnMissingBean.class).rateLimiterEventsConsumerRegistry());
  }

  /**
   * Get the bean definition for 'rateLimiterEventsConsumerRegistry'.
   */
  public static BeanDefinition getRateLimiterEventsConsumerRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EventConsumerRegistry.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(EventConsumerRegistry.class, RateLimiterEvent.class));
    beanDefinition.setInstanceSupplier(getRateLimiterEventsConsumerRegistryInstanceSupplier());
    return beanDefinition;
  }
}
