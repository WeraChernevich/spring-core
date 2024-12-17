package ru.chernevich;

public class Main {
    public static void main(String[] args) {
        BeenFactory beenFactory = new BeenFactory();
        beenFactory.register(Injectable.class);
        beenFactory.register(Source.class);

        Source source = beenFactory.getBeen(Source.class);

        source.call();
    }
}