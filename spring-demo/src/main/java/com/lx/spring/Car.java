package com.lx.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author leixin
 */
public class Car implements InitializingBean, DisposableBean {
    public Car() {
        System.out.println("Car.Car");
    }

    @PostConstruct
    public void afterConstruct() {
        System.out.println("Car.afterConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Car.preDestroy");
    }

    public void init() {
        System.out.println("Car.init");
    }

    public void carDestroy() {
        System.out.println("Car.carDestroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Car.afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Car.destroy");
    }
}
