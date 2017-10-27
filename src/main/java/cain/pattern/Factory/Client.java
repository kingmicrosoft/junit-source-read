package cain.pattern.Factory;

import cain.pattern.Factory.AbstractFactory.Factory;
import cain.pattern.Factory.AbstractFactory.PenFamily;
import cain.pattern.Factory.FactoryMethod.WenJuFactory;

/**
 * Created by Chai Wenrun on 2017/7/10 0010.
 */
public class Client {
    public static void main(String[] args) {
        WenJuFactory wenJuFactory = new WenJuFactory();
        wenJuFactory.producePen();
        wenJuFactory.produceNoteBook();

        //这个很好理解， 就是一个文具厂，有两条生产线，分别是pen和notebook.
        //然后，有一个新的需求，要求该工厂细化产品，pen包括0.5mm的和0.3mm的；笔记本包括黑色和白色的；
        //0.5mm和0.3mm的pen属于一个产品结构，笔记本的黑色和白色属于一个等级的产品结构
        //pen属于一个产品簇，笔记本是另外一个产品簇
        //明白了等级结构和产品族的概念，就理解工厂方法模式和抽象工厂模式的区别了，如果工厂的产品全部属于同一个等级结构，
        // 则属于工厂方法模式；如果工厂的产品来自多个等级结构，则属于抽象工厂模式

        Factory factory = new PenFamily();
        factory.getProduct();
        factory.getNewProduct();

//		factory = new NoteBookFamily();
//		factory.getProduct();
//		factory.getNewProduct();
    }
}
