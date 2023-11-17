package io.github.resilience4j.springboot3.timelimiter.autoconfigure;

import io.github.resilience4j.micrometer.tagged.TaggedTimeLimiterMetricsPublisher;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link TimeLimiterMetricsAutoConfiguration}.
 */
public class TimeLimiterMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'timeLimiterMetricsAutoConfiguration'.
   */
  public static BeanDefinition getTimeLimiterMetricsAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimeLimiterMetricsAutoConfiguration.class);
    beanDefinition.setTargetType(TimeLimiterMetricsAutoConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(TimeLimiterMetricsAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(TimeLimiterMetricsAutoConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'taggedTimeLimiterMetricsPublisher'.
   */
  private static BeanInstanceSupplier<TaggedTimeLimiterMetricsPublisher> getTaggedTimeLimiterMetricsPublisherInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TaggedTimeLimiterMetricsPublisher>forFactoryMethod(TimeLimiterMetricsAutoConfiguration.class, "taggedTimeLimiterMetricsPublisher", MeterRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TimeLimiterMetricsAutoConfiguration.class).taggedTimeLimiterMetricsPublisher(args.get(0)));
  }

  /**
   * Get the bean definition for 'taggedTimeLimiterMetricsPublisher'.
   */
  public static BeanDefinition getTaggedTimeLimiterMetricsPublisherBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TaggedTimeLimiterMetricsPublisher.class);
    beanDefinition.setInstanceSupplier(getTaggedTimeLimiterMetricsPublisherInstanceSupplier());
    return beanDefinition;
  }
}
