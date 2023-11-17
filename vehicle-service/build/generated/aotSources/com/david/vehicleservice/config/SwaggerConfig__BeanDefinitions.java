package com.david.vehicleservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SwaggerConfig}.
 */
public class SwaggerConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'swaggerConfig'.
   */
  public static BeanDefinition getSwaggerConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SwaggerConfig.class);
    beanDefinition.setTargetType(SwaggerConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(SwaggerConfig.class);
    beanDefinition.setInstanceSupplier(SwaggerConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'myOpenAPI'.
   */
  private static BeanInstanceSupplier<OpenAPI> getMyOpenAPIInstanceSupplier() {
    return BeanInstanceSupplier.<OpenAPI>forFactoryMethod(SwaggerConfig.class, "myOpenAPI")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(SwaggerConfig.class).myOpenAPI());
  }

  /**
   * Get the bean definition for 'myOpenAPI'.
   */
  public static BeanDefinition getMyOpenAPIBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(OpenAPI.class);
    beanDefinition.setInstanceSupplier(getMyOpenAPIInstanceSupplier());
    return beanDefinition;
  }
}
