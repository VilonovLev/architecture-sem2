package org.example;

public class Main {
    public static void main(String[] args) {
        FooImpl foo = new FooImpl();
        Decorator decorator = new DecoratorA(new DecoratorB(foo));
        decorator.foo();
    }
}