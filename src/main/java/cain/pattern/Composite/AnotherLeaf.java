package cain.pattern.Composite;

/**
 * Created by Chai Wenrun on 2017/6/27 0027.
 */
public class AnotherLeaf implements Component {
    public int add(Component component) {
        System.out.println("cannot add for leaf");
        return 0;
    }

    public int remove(Component component) {
        System.out.println("cannot rm for leaf");
        return 0;
    }

    public void display(String msg) {
        System.out.println(this.getClass().getName()+ ": THE MESSAGE DISPLAY AS : " + msg);
    }
}
