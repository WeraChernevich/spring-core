package ru.chernevich;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SimpleBean {
    public SimpleBean() {
        System.out.println("SimpleBean created");
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("SimpleBean calling afterInit");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("SimpleBean before destroy");
    }
}
