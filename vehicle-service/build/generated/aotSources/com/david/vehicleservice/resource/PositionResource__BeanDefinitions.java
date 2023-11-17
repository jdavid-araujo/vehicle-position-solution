package com.david.vehicleservice.resource;

import com.david.vehicleservice.modal.mapper.PositionMapper;
import com.david.vehicleservice.service.PositionService;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PositionResource}.
 */
public class PositionResource__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'positionResource'.
   */
  private static BeanInstanceSupplier<PositionResource> getPositionResourceInstanceSupplier() {
    return BeanInstanceSupplier.<PositionResource>forConstructor(PositionService.class, PositionMapper.class)
            .withGenerator((registeredBean, args) -> new PositionResource(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'positionResource'.
   */
  public static BeanDefinition getPositionResourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PositionResource.class);
    beanDefinition.setInstanceSupplier(getPositionResourceInstanceSupplier());
    return beanDefinition;
  }
}
