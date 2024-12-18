package ru.chernevich;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Lazy
public class SecondSingleton {
    private Instant currentTime;

    private final PrototypeComponent component;

    public SecondSingleton(PrototypeComponent component) {
        System.out.println("SecondSingleton created");
        currentTime = Instant.now();
        printSecondSingleton();
        this.component = component;
        component.printCreatedTime();
    }

    private void printSecondSingleton() {
        System.out.println("SecondSingleton created at: " + currentTime);
    }
}
