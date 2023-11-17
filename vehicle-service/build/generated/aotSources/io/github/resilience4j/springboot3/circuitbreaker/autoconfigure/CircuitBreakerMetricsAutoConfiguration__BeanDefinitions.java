package io.github.resilience4j.springboot3.circuitbreaker.autoconfigure;

import io.github.resilience4j.micrometer.tagged.TaggedCircuitBreakerMetricsPublisher;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link CircuitBreakerMetricsAutoConfiguration}.
 */
public class CircuitBreakerMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'circuitBreakerMetricsAutoConfiguration'.
   */
  public static BeanDefinition getCircuitBreakerMetricsAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CircuitBreakerMetricsAutoConfiguration.class);
    beanDefinition.setTargetType(CircuitBreakerMetricsAutoConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(CircuitBreakerMetricsAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CircuitBreakerMetricsAutoConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'taggedCircuitBreakerMetricsPublisher'.
   */
  private static BeanInstanceSupplier<TaggedCircuitBreakerMetricsPublisher> getTaggedCircuitBreakerMetricsPublisherInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TaggedCircuitBreakerMetricsPublisher>forFactoryMethod(CircuitBreakerMetricsAutoConfiguration.class, "taggedCircuitBreakerMetricsPublisher", MeterRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CircuitBreakerMetricsAutoConfiguration.class).taggedCircuitBreakerMetricsPublisher(args.get(0)));
  }

  /**
   * Get the bean definition for 'taggedCircuitBreakerMetricsPublisher'.
   */
  public static BeanDefinition getTaggedCircuitBreakerMetricsPublisherBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TaggedCircuitBreakerMetricsPublisher.class);
    beanDefinition.setInstanceSupplier(getTaggedCircuitBreakerMetricsPublisherInstanceSupplier());
    return beanDefinition;
  }
}
