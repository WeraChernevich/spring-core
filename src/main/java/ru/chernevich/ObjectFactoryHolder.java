package ru.chernevich;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectFactoryHolder {

    private final ObjectFactory<PrototypeComponent> prototypeComponentObjectFactory;

    private final ObjectFactory<FirstSingleton> firstSingletonObjectFactory;

    @Autowired
    public ObjectFactoryHolder(ObjectFactory<PrototypeComponent> prototypeComponentObjectFactory,
                               ObjectFactory<FirstSingleton> firstSingletonObjectFactory) {
        this.prototypeComponentObjectFactory = prototypeComponentObjectFactory;
        this.firstSingletonObjectFactory = firstSingletonObjectFactory;
    }

    public FirstSingleton getSingleton() {
        return firstSingletonObjectFactory.getObject();
    }

    public PrototypeComponent getPrototype() {
        return prototypeComponentObjectFactory.getObject();
    }
}

