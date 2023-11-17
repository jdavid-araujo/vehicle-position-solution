package org.springframework.cloud.openfeign.support;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FeignHttpClientProperties}.
 */
public class FeignHttpClientProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'feignHttpClientProperties'.
   */
  public static BeanDefinition getFeignHttpClientPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FeignHttpClientProperties.class);
    beanDefinition.setInstanceSupplier(FeignHttpClientProperties::new);
    return beanDefinition;
  }
}
