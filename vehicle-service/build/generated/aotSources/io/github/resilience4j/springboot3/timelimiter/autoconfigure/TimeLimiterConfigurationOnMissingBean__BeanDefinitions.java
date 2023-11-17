package io.github.resilience4j.springboot3.timelimiter.autoconfigure;

import io.github.resilience4j.consumer.EventConsumerRegistry;
import io.github.resilience4j.timelimiter.event.TimeLimiterEvent;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link TimeLimiterConfigurationOnMissingBean}.
 */
public class TimeLimiterConfigurationOnMissingBean__BeanDefinitions {
  /**
   * Get the bean definition for 'timeLimiterConfigurationOnMissingBean'.
   */
  public static BeanDefinition getTimeLimiterConfigurationOnMissingBeanBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimeLimiterConfigurationOnMissingBean.class);
    beanDefinition.setTargetType(TimeLimiterConfigurationOnMissingBean.class);
    ConfigurationClassUtils.initializeConfigurationClass(TimeLimiterConfigurationOnMissingBean.class);
    beanDefinition.setInstanceSupplier(TimeLimiterConfigurationOnMissingBean$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'timeLimiterEventsConsumerRegistry'.
   */
  private static BeanInstanceSupplier<EventConsumerRegistry> getTimeLimiterEventsConsumerRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EventConsumerRegistry>forFactoryMethod(TimeLimiterConfigurationOnMissingBean.class, "timeLimiterEventsConsumerRegistry")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TimeLimiterConfigurationOnMissingBean.class).timeLimiterEventsConsumerRegistry());
  }

  /**
   * Get the bean definition for 'timeLimiterEventsConsumerRegistry'.
   */
  public static BeanDefinition getTimeLimiterEventsConsumerRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EventConsumerRegistry.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(EventConsumerRegistry.class, TimeLimiterEvent.class));
    beanDefinition.setInstanceSupplier(getTimeLimiterEventsConsumerRegistryInstanceSupplier());
    return beanDefinition;
  }
}
