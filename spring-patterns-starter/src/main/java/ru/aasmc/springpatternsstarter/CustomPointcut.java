package ru.aasmc.springpatternsstarter;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class CustomPointcut extends DynamicMethodMatcherPointcut {

    private String packagesToHandle = "ru.aasmc.springpatterns.corona.psr";

    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        return true;
    }

    @Override
    public ClassFilter getClassFilter() {
        return clazz -> clazz.getPackage().getName().contains(packagesToHandle);
    }
}
