package cain.pattern.Template;

/**
 * Created by Chai Wenrun on 2017/6/27 0027.
 */
public abstract class TemplateMethod {

    public void templateMethod() {
        this.method1();
        this.method2();
        this.method3();
    }

    protected abstract void method1();

    protected abstract void method2();

    protected abstract void method3();

}
