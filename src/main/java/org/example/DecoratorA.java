package org.example;

public class DecoratorA extends Decorator{
    public DecoratorA(Foo foo) {
        super(foo);
    }

    @Override
    public void foo() {
        super.foo();
        bar();
    }

    @Override
    void bar() {
        System.out.print("World!");
    }
}
