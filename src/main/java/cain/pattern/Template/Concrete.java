package cain.pattern.Template;

/**
 * Created by Chai Wenrun on 2017/6/27 0027.
 */


/*

模板方法：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。 T模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

模板方法模式的优点：
1)模板方法模式在一个类中形式化地定义算法，而由它的子类实现细节的处理。
2)模板方法是一种代码复用的基本技术。它们在类库中尤为重要，它们提取了类库中的公共行为。
3)模板方法模式导致一种反向的控制结构，这种结构有时被称为“好莱坞法则” ，即“别找我们，,我们找你”通过一个父类调用其子类的操作(而不是相反的子类调用父类)，通过对子类的扩展增加新的行为，符合“开闭原则”

 */
public class Concrete extends TemplateMethod{
    @Override
    protected void method1() {
        System.out.println("method1 is called!");
    }

    @Override
    protected void method2() {
        System.out.println("method2 is called!");

    }

    @Override
    protected void method3() {
        System.out.println("method3 is called!");

    }

    public static void main(String[] args) {
        new Concrete().templateMethod();
    }
}
