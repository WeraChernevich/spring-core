package ru.chernevich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Worker {
    @Autowired
    @Qualifier("simpleLogicClass")
    private LogicClass simpleLogic;

    @Autowired
    @Qualifier("logicClassData")
    private LogicClass dataSimpleLogic;

    @Autowired
    private DataComponent dataComponent;

    public void call() {
        simpleLogic.simpleLogic();
        dataSimpleLogic.printLogicData();
        dataComponent.someWork();
    }
}
