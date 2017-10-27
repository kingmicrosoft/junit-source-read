package cain.pattern.Adapter;

/**
 * Created by Chai Wenrun on 2017/8/7 0007.
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.method();
        target.newMethod();

    }
}
