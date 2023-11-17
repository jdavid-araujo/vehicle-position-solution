package com.david.vehicleservice.exceptionhandler;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ExceptionHandlerGeneral}.
 */
public class ExceptionHandlerGeneral__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ExceptionHandlerGeneral apply(RegisteredBean registeredBean,
      ExceptionHandlerGeneral instance) {
    AutowiredFieldValueResolver.forRequiredField("messageSource").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
