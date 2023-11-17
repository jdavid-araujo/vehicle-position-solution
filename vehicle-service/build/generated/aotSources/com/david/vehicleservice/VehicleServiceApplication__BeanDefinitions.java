package com.david.vehicleservice;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link VehicleServiceApplication}.
 */
public class VehicleServiceApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'vehicleServiceApplication'.
   */
  public static BeanDefinition getVehicleServiceApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VehicleServiceApplication.class);
    beanDefinition.setTargetType(VehicleServiceApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(VehicleServiceApplication.class);
    beanDefinition.setInstanceSupplier(VehicleServiceApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
