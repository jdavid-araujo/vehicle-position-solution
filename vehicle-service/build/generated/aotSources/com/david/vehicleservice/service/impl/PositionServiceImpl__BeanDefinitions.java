package com.david.vehicleservice.service.impl;

import com.david.vehicleservice.repository.PositionRepository;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PositionServiceImpl}.
 */
public class PositionServiceImpl__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'positionServiceImpl'.
   */
  private static BeanInstanceSupplier<PositionServiceImpl> getPositionServiceImplInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PositionServiceImpl>forConstructor(PositionRepository.class)
            .withGenerator((registeredBean, args) -> new PositionServiceImpl(args.get(0)));
  }

  /**
   * Get the bean definition for 'positionServiceImpl'.
   */
  public static BeanDefinition getPositionServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PositionServiceImpl.class);
    beanDefinition.setInstanceSupplier(getPositionServiceImplInstanceSupplier());
    return beanDefinition;
  }
}
