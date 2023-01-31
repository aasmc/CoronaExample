package ru.aasmc.springpatterns.corona.controllers;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.aasmc.springpatterns.corona.infra.BeanMD;
import ru.aasmc.springpatterns.corona.infra.CCL;

@RestController
public class BeanRegistratorController {
    @Autowired
    private GenericApplicationContext context;

    @Autowired
    private CCL ccl;

    @SneakyThrows
    @PostMapping("/regbean")
    public String regBean(@RequestBody BeanMD beanMD) {
        Class<?> beanClass = ccl.findClass(beanMD.getBeanClassName());
        BeanDefinitionRegistry beanFactory = (BeanDefinitionRegistry) context.getBeanFactory();
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
        beanDefinition.setBeanClass(beanClass);
        beanFactory.registerBeanDefinition(beanMD.getBeanName(), beanDefinition);
        context.getBean(beanMD.getBeanName());
        return "registered";
    }
}
