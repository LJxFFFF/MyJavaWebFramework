package org.smart4j.framework.bean;

import java.lang.reflect.Method;

/**
 * 封装Action信息
 */
public class Handler {

    private Class<?> controllerClass;   //Controller类
    private Method actionMethod;        //Action方法

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}
