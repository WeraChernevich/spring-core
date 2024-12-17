package ru.chernevich;

public class Source {
    @Inject
    private Injectable injectable;

    public void call() {
        System.out.println("Source calling call");
        injectable.doWork();
    }
}
