package io.github.resilience4j.springboot3.retry.autoconfigure;

import io.github.resilience4j.micrometer.tagged.TaggedRetryMetricsPublisher;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link RetryMetricsAutoConfiguration}.
 */
public class RetryMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'retryMetricsAutoConfiguration'.
   */
  public static BeanDefinition getRetryMetricsAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RetryMetricsAutoConfiguration.class);
    beanDefinition.setTargetType(RetryMetricsAutoConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(RetryMetricsAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(RetryMetricsAutoConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'taggedRetryMetricsPublisher'.
   */
  private static BeanInstanceSupplier<TaggedRetryMetricsPublisher> getTaggedRetryMetricsPublisherInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TaggedRetryMetricsPublisher>forFactoryMethod(RetryMetricsAutoConfiguration.class, "taggedRetryMetricsPublisher", MeterRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RetryMetricsAutoConfiguration.class).taggedRetryMetricsPublisher(args.get(0)));
  }

  /**
   * Get the bean definition for 'taggedRetryMetricsPublisher'.
   */
  public static BeanDefinition getTaggedRetryMetricsPublisherBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TaggedRetryMetricsPublisher.class);
    beanDefinition.setInstanceSupplier(getTaggedRetryMetricsPublisherInstanceSupplier());
    return beanDefinition;
  }
}
