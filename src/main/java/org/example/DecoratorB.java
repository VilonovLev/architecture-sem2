package org.example;

public class DecoratorB extends Decorator{

    public DecoratorB(Foo foo) {
        super(foo);
    }

    @Override
    public void foo() {
        bar();
        super.foo();
    }

    @Override
    void bar() {
        System.out.print("Hello");
    }

}
