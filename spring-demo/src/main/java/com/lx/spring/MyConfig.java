package com.lx.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;

/**
 * @author leixin
 */
@Configuration
@ComponentScan(basePackages = {"com.lx.spring.service"})
@Import(value = {MyImportSelector.class})
public class MyConfig {

    @Bean
    public Person person1() {
        return new Person("abc", 10);
    }

    @Bean(value = "efg")
//    @Primary
    public Person person2() {
        return new Person("efg", 10);
    }

    @Bean
    @Lazy
    public Person person3() {
        return new Person("efg", 10);
    }

    @Bean
    @Conditional(value = MacCondition.class)
    public Mac mac() {
        return new Mac();
    }

    @Bean
    @Conditional(value = WinCondition.class)
    public Windows windows() {
        return new Windows();
    }

    @Bean
    @Profile("dev")
    public Mac mac1() {
        return new Mac();
    }

    @Bean
    @Profile("prod")
    public Windows windows2() {
        return new Windows();
    }

}
