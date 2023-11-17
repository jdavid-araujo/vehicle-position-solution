package io.github.resilience4j.springboot3.retry.autoconfigure;

import io.github.resilience4j.consumer.EventConsumerRegistry;
import io.github.resilience4j.retry.event.RetryEvent;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link RetryConfigurationOnMissingBean}.
 */
public class RetryConfigurationOnMissingBean__BeanDefinitions {
  /**
   * Get the bean definition for 'retryConfigurationOnMissingBean'.
   */
  public static BeanDefinition getRetryConfigurationOnMissingBeanBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RetryConfigurationOnMissingBean.class);
    beanDefinition.setTargetType(RetryConfigurationOnMissingBean.class);
    ConfigurationClassUtils.initializeConfigurationClass(RetryConfigurationOnMissingBean.class);
    beanDefinition.setInstanceSupplier(RetryConfigurationOnMissingBean$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'retryEventConsumerRegistry'.
   */
  private static BeanInstanceSupplier<EventConsumerRegistry> getRetryEventConsumerRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EventConsumerRegistry>forFactoryMethod(RetryConfigurationOnMissingBean.class, "retryEventConsumerRegistry")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RetryConfigurationOnMissingBean.class).retryEventConsumerRegistry());
  }

  /**
   * Get the bean definition for 'retryEventConsumerRegistry'.
   */
  public static BeanDefinition getRetryEventConsumerRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EventConsumerRegistry.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(EventConsumerRegistry.class, RetryEvent.class));
    beanDefinition.setInstanceSupplier(getRetryEventConsumerRegistryInstanceSupplier());
    return beanDefinition;
  }
}
