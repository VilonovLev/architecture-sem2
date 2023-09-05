package org.example;

public abstract class Decorator implements Foo{

    private Foo foo;

    public Decorator() {}

    public Decorator(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void foo() {
        foo.foo();
    }

     abstract void bar();

}
