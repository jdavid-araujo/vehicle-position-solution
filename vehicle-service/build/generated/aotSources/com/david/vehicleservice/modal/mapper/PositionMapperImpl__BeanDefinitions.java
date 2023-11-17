package com.david.vehicleservice.modal.mapper;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PositionMapperImpl}.
 */
public class PositionMapperImpl__BeanDefinitions {
  /**
   * Get the bean definition for 'positionMapperImpl'.
   */
  public static BeanDefinition getPositionMapperImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PositionMapperImpl.class);
    beanDefinition.setInstanceSupplier(PositionMapperImpl::new);
    return beanDefinition;
  }
}
