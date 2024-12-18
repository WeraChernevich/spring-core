package ru.chernevich;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.chernevich")
public class AppConfig{
    @Bean
    public LogicClass simpleLogicClass() {
        return new LogicClass();
    }
    @Bean
    public LogicClass logicClassData() {
        return new LogicClass("Logic class", 42);
    }
}
