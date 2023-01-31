package ru.aasmc.springpatternsstarter;

import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(LegacyBeanDefinitionRegistrar.class)
public class Config {

    @Bean
    public InjectListBPP injectListBPP() {
        return new InjectListBPP();
    }

    @Bean
    public CoronaControllerAdvice coronaControllerAdvice() {
        return new CoronaControllerAdvice();
    }

    @Bean
    public CustomPointcut customPointcut() {
        return new CustomPointcut();
    }

    @Bean
    public ExceptionHandlerInterceptor exceptionHandlerInterceptor() {
        return new ExceptionHandlerInterceptor();
    }

    @Bean
    public DefaultPointcutAdvisor defaultPointcutAdvisor() {
        return new DefaultPointcutAdvisor(customPointcut(), exceptionHandlerInterceptor());
    }

}
