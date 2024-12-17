package ru.chernevich;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BeenFactory {

    private final Map<Class<?>, Object> container = new HashMap<>();

    public void register(Class<?> type) {
        Object mainBeen = create(type);
        container.put(type, mainBeen);

        for (Field field : type.getDeclaredFields()) {
            if(field.isAnnotationPresent(Inject.class)) {
                Object been = container.get(field.getType());

                if(been == null) {
                    continue;
                }

                field.setAccessible(true);
                try {
                    field.set(mainBeen, been);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public <T> T getBeen(Class<T> type) {
        Object been = container.get(type);

        if(been == null) throw  new NullPointerException();

        return (T) been;
    }

    private final Object create(Class<?> type){
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
