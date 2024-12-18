package ru.chernevich;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Scope("singleton")
@Component
public class FirstSingleton {

    private Instant currentTime;

    public FirstSingleton() {
        System.out.println("FirstSingleton created");
        currentTime = Instant.now();
        printCreatedTime();
    }

    private void printCreatedTime() {
        System.out.println("FirstSingleton created at: " + currentTime);
    }
}
