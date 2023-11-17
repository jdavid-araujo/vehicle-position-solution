package org.springframework.cloud.openfeign.loadbalancer;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;

/**
 * Bean definitions for {@link FeignLoadBalancerAutoConfiguration}.
 */
public class FeignLoadBalancerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'feignLoadBalancerAutoConfiguration'.
   */
  public static BeanDefinition getFeignLoadBalancerAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FeignLoadBalancerAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(FeignLoadBalancerAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'xForwarderHeadersFeignTransformer'.
   */
  private static BeanInstanceSupplier<XForwardedHeadersTransformer> getXForwarderHeadersFeignTransformerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<XForwardedHeadersTransformer>forFactoryMethod(FeignLoadBalancerAutoConfiguration.class, "xForwarderHeadersFeignTransformer", LoadBalancerClientFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(FeignLoadBalancerAutoConfiguration.class).xForwarderHeadersFeignTransformer(args.get(0)));
  }

  /**
   * Get the bean definition for 'xForwarderHeadersFeignTransformer'.
   */
  public static BeanDefinition getXForwarderHeadersFeignTransformerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(XForwardedHeadersTransformer.class);
    beanDefinition.setInstanceSupplier(getXForwarderHeadersFeignTransformerInstanceSupplier());
    return beanDefinition;
  }
}
