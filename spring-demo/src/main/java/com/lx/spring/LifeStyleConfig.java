package com.lx.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author leixin
 */
@ComponentScan(basePackages = {"com.lx.spring.fruit"})
public class LifeStyleConfig {
    @Bean(initMethod = "init", destroyMethod = "carDestroy")
    public Car car() {
        return new Car();
    }
}
