package cain.pattern.Adapter;

/**
 * Created by Chai Wenrun on 2017/8/7 0007.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method() {
        adaptee.someMethod();
    }

    @Override
    public void newMethod() {
        System.out.println("new M!");
    }
}
