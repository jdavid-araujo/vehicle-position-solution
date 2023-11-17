package com.david.vehicleservice.resource;

import com.david.vehicleservice.modal.mapper.PositionMapper;
import com.david.vehicleservice.modal.mapper.VeihicleMapper;
import com.david.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link VehicleResource}.
 */
public class VehicleResource__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'vehicleResource'.
   */
  private static BeanInstanceSupplier<VehicleResource> getVehicleResourceInstanceSupplier() {
    return BeanInstanceSupplier.<VehicleResource>forConstructor(VehicleService.class, VeihicleMapper.class, PositionMapper.class)
            .withGenerator((registeredBean, args) -> new VehicleResource(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'vehicleResource'.
   */
  public static BeanDefinition getVehicleResourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VehicleResource.class);
    beanDefinition.setInstanceSupplier(getVehicleResourceInstanceSupplier());
    return beanDefinition;
  }
}
