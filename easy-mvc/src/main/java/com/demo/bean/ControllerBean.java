package com.demo.bean;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Method;

@Getter
@Setter
public class ControllerBean {
    private Class<?> controllerClass;
    private Method controllerMethod;

    public ControllerBean(Class<?> controllerClass, Method controllerMethod) {
        this.controllerClass = controllerClass;
        this.controllerMethod = controllerMethod;
    }
}
