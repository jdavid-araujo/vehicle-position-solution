package com.david.vehicleservice.service.impl;

import com.david.vehicleservice.repository.VehicleRepository;
import com.david.vehicleservice.service.PositionService;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link VehicleServiceImpl}.
 */
public class VehicleServiceImpl__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'vehicleServiceImpl'.
   */
  private static BeanInstanceSupplier<VehicleServiceImpl> getVehicleServiceImplInstanceSupplier() {
    return BeanInstanceSupplier.<VehicleServiceImpl>forConstructor(VehicleRepository.class, PositionService.class)
            .withGenerator((registeredBean, args) -> new VehicleServiceImpl(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'vehicleServiceImpl'.
   */
  public static BeanDefinition getVehicleServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VehicleServiceImpl.class);
    beanDefinition.setInstanceSupplier(getVehicleServiceImplInstanceSupplier());
    return beanDefinition;
  }
}
