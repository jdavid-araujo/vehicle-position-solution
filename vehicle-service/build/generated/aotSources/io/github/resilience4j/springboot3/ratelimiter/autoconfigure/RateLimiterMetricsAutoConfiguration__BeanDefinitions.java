package io.github.resilience4j.springboot3.ratelimiter.autoconfigure;

import io.github.resilience4j.micrometer.tagged.TaggedRateLimiterMetricsPublisher;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link RateLimiterMetricsAutoConfiguration}.
 */
public class RateLimiterMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'rateLimiterMetricsAutoConfiguration'.
   */
  public static BeanDefinition getRateLimiterMetricsAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RateLimiterMetricsAutoConfiguration.class);
    beanDefinition.setTargetType(RateLimiterMetricsAutoConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(RateLimiterMetricsAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(RateLimiterMetricsAutoConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'taggedRateLimiterMetricsPublisher'.
   */
  private static BeanInstanceSupplier<TaggedRateLimiterMetricsPublisher> getTaggedRateLimiterMetricsPublisherInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TaggedRateLimiterMetricsPublisher>forFactoryMethod(RateLimiterMetricsAutoConfiguration.class, "taggedRateLimiterMetricsPublisher", MeterRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RateLimiterMetricsAutoConfiguration.class).taggedRateLimiterMetricsPublisher(args.get(0)));
  }

  /**
   * Get the bean definition for 'taggedRateLimiterMetricsPublisher'.
   */
  public static BeanDefinition getTaggedRateLimiterMetricsPublisherBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TaggedRateLimiterMetricsPublisher.class);
    beanDefinition.setInstanceSupplier(getTaggedRateLimiterMetricsPublisherInstanceSupplier());
    return beanDefinition;
  }
}
