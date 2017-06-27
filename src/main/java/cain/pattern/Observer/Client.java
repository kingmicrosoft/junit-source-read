package cain.pattern.Observer;


/**
 * Created by Chai Wenrun on 2017/6/27 0027.
 */

/*
　观察者模式是对象的行为模式，又叫发布-订阅(Publish/Subscribe)模式、模型-视图(Model/View)模式、源-监听器(Source/Listener)模式或从属者(Dependents)模式。

　观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态上发生变化时，会通知所有观察者对象，使它们能够自动更新自己。

结构关系是：Subject包含多个Observer, 推送的时候会发送通知到观察者；


推模型和拉模型：

    在观察者模式中，又分为推模型和拉模型两种方式。
　　（1）推模型
　　　　 主题对象向观察者推送主题的详细信息，不管观察者是否需要，推送的信息通常是主题对象的全部或部分数据。

　　（2）拉模型
　　　　 主题对象在通知观察者的时候，只传递少量信息。如果观察者需要更具体的信息，由观察者主动到主题对象中获取，相当于是观察者从主题对象中拉数据。
         一般这种模型的实现中，会把主题对象自身通过update()方法传递给观察者，这样在观察者需要获取数据的时候，就可以通过这个引用来获取了。
        (其实这个也是一种推模型的变种，只是后面的具体信息是观察者拉取的)

参考：http://www.cnblogs.com/java-my-life/archive/2012/05/16/2502279.html
 */
public class Client {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();
        mySubject.addObserver(new Observer1());
        mySubject.addObserver(new Observer2());
        mySubject.operation();
    }
}
