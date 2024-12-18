package ru.chernevich;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Scope("prototype")
@Component
public class PrototypeComponent {

    private Instant currentTime;

    public PrototypeComponent() {
        System.out.println("Prototype created");
        currentTime = Instant.now();
        printCreatedTime();
        
    }

    public void printCreatedTime() {
        System.out.println("Prototype created at: " + currentTime);
    }


}
