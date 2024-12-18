package ru.chernevich;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.chernevich")
public class AppConfig{

    @Bean(initMethod = "afterInit", destroyMethod = "beforeDestroy")
    public SimpleBean simpleBean(){
        return new SimpleBean();
    }
//    @Bean
//    public LogicClass simpleLogicClass() {
//        return new LogicClass();
//    }
//    @Bean
//    public LogicClass logicClassData() {
//        return new LogicClass("Logic class", 42);
//    }
}
