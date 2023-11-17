package com.david.vehicleservice.modal.mapper;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link VeihicleMapperImpl}.
 */
public class VeihicleMapperImpl__BeanDefinitions {
  /**
   * Get the bean definition for 'veihicleMapperImpl'.
   */
  public static BeanDefinition getVeihicleMapperImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VeihicleMapperImpl.class);
    beanDefinition.setInstanceSupplier(VeihicleMapperImpl::new);
    return beanDefinition;
  }
}
