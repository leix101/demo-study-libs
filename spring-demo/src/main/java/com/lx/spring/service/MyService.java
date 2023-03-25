package com.lx.spring.service;

import com.lx.spring.Person;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author leixin
 */
@Service
@Data
//@Scope(value = "prototype")
@Scope(value = "singleton")
public class MyService {
    @Autowired
    @Qualifier(value = "person3")
    private Person person;

}
