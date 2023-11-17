package com.david.vehicleservice.exceptionhandler;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ExceptionHandlerGeneral}.
 */
public class ExceptionHandlerGeneral__BeanDefinitions {
  /**
   * Get the bean definition for 'exceptionHandlerGeneral'.
   */
  public static BeanDefinition getExceptionHandlerGeneralBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ExceptionHandlerGeneral.class);
    InstanceSupplier<ExceptionHandlerGeneral> instanceSupplier = InstanceSupplier.using(ExceptionHandlerGeneral::new);
    instanceSupplier = instanceSupplier.andThen(ExceptionHandlerGeneral__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
