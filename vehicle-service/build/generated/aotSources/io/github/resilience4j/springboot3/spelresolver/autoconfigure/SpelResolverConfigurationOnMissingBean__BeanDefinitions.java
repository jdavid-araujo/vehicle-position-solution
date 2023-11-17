package io.github.resilience4j.springboot3.spelresolver.autoconfigure;

import io.github.resilience4j.spring6.spelresolver.SpelResolver;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Bean definitions for {@link SpelResolverConfigurationOnMissingBean}.
 */
public class SpelResolverConfigurationOnMissingBean__BeanDefinitions {
  /**
   * Get the bean definition for 'spelResolverConfigurationOnMissingBean'.
   */
  public static BeanDefinition getSpelResolverConfigurationOnMissingBeanBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpelResolverConfigurationOnMissingBean.class);
    beanDefinition.setTargetType(SpelResolverConfigurationOnMissingBean.class);
    ConfigurationClassUtils.initializeConfigurationClass(SpelResolverConfigurationOnMissingBean.class);
    beanDefinition.setInstanceSupplier(SpelResolverConfigurationOnMissingBean$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'parameterNameDiscoverer'.
   */
  private static BeanInstanceSupplier<ParameterNameDiscoverer> getParameterNameDiscovererInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ParameterNameDiscoverer>forFactoryMethod(SpelResolverConfigurationOnMissingBean.class, "parameterNameDiscoverer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(SpelResolverConfigurationOnMissingBean.class).parameterNameDiscoverer());
  }

  /**
   * Get the bean definition for 'parameterNameDiscoverer'.
   */
  public static BeanDefinition getParameterNameDiscovererBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ParameterNameDiscoverer.class);
    beanDefinition.setInstanceSupplier(getParameterNameDiscovererInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'spelExpressionParser'.
   */
  private static BeanInstanceSupplier<SpelExpressionParser> getSpelExpressionParserInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SpelExpressionParser>forFactoryMethod(SpelResolverConfigurationOnMissingBean.class, "spelExpressionParser")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(SpelResolverConfigurationOnMissingBean.class).spelExpressionParser());
  }

  /**
   * Get the bean definition for 'spelExpressionParser'.
   */
  public static BeanDefinition getSpelExpressionParserBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpelExpressionParser.class);
    beanDefinition.setInstanceSupplier(getSpelExpressionParserInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'spelResolver'.
   */
  private static BeanInstanceSupplier<SpelResolver> getSpelResolverInstanceSupplier() {
    return BeanInstanceSupplier.<SpelResolver>forFactoryMethod(SpelResolverConfigurationOnMissingBean.class, "spelResolver", SpelExpressionParser.class, ParameterNameDiscoverer.class, BeanFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpelResolverConfigurationOnMissingBean.class).spelResolver(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'spelResolver'.
   */
  public static BeanDefinition getSpelResolverBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpelResolver.class);
    beanDefinition.setInstanceSupplier(getSpelResolverInstanceSupplier());
    return beanDefinition;
  }
}
