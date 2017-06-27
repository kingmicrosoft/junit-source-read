package cain.pattern.Composite;

/**
 * Created by Chai Wenrun on 2017/6/27 0027.
 */

/*
解释：
组合模式(composite pattern)：将对象组合成树形结构以表示'部分-整体'的层次结构，使得用户对单个对象和组合对象的使用有一致性；

何时采用组合模式：

     1.需求重要体现部分与整体的层次结构时

     2.你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。


 使用效果：

     1．Composite模式采用树形结构来实现普遍存在的对象容器，从而将“一对多”的关系转化“一对一”的关系，使得客户代码可以一致地处理对象和对象容器，无需关心处理的是单个的对象，还是组合的对象容器。
     2．将“客户代码与复杂的对象容器结构”解耦是Composite模式的核心思想，解耦之后，客户代码将与纯粹的抽象接口——而非对象容器的复内部实现结构——发生依赖关系，从而更能“应对变化”。
     3．Composite模式中，是将“Add和Remove等和对象容器相关的方法”定义在“表示抽象对象的Component类”中，还是将其定义在“表示对象容器的Composite类”中，是一个关乎“透明性”和“安全性”的两难问题，需要仔细权衡。这里有可能违背面向对象的“单一职责原则”，但是对于这种特殊结构，这又是必须付出的代价。ASP.NET控件的实现在这方面为我们提供了一个很好的示范。
     4．Composite模式在具体实现中，可以让父对象中的子对象反向追溯；如果父对象有频繁的遍历需求，可使用缓存技巧来改善效率。

参考：http://www.cnblogs.com/peida/archive/2008/09/09/1284686.html
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.add(new Leaf("leaf class"));
        root.add(new AnotherLeaf());

        root.display("show Msg");
    }

}
