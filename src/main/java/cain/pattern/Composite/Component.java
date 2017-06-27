package cain.pattern.Composite;

/**
 * Created by Chai Wenrun on 2017/6/27 0027.
 */
public interface Component {
    int add(Component component);
    int remove(Component component);
    void display(String msg);
}
