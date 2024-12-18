package ru.chernevich;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleBean simpleBean = context.getBean(SimpleBean.class);

        ((AbstractApplicationContext)context).getBeanFactory().destroyBean("simpleBean", simpleBean);

//
//        System.out.println("Main method was called");
//
//        context.getBean(SecondSingleton.class);
//
//        ObjectFactoryHolder factoryHolder = context.getBean(ObjectFactoryHolder.class);
//
//        System.out.println(factoryHolder.getPrototype() == factoryHolder.getPrototype());
//        System.out.println(factoryHolder.getSingleton() == factoryHolder.getSingleton());
//
//        FirstSingleton firstSingleton = context.getBean(FirstSingleton.class);
//        FirstSingleton firstSingleton2 = context.getBean(FirstSingleton.class);
//
//        System.out.println(firstSingleton == firstSingleton2);
//
//        PrototypeComponent component = context.getBean(PrototypeComponent.class);
//        PrototypeComponent component2 = context.getBean(PrototypeComponent.class);
//
//        System.out.println(component == component2);
//
//        SecondSingleton secondSingleton = context.getBean(SecondSingleton.class);
//        SecondSingleton secondSingleton2 = context.getBean(SecondSingleton.class);
//
//        System.out.println(secondSingleton == secondSingleton2);
//
//
//
//        context.getBean(Worker.class).call();
//        LogicClass logicClass = context.getBean("logicClassData", LogicClass.class);
//        logicClass.simpleLogic();
//        logicClass.printLogicData();
//        context.getBean(DataComponent.class).someWork();

    }
}
