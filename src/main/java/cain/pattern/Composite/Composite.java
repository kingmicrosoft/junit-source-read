package cain.pattern.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chai Wenrun on 2017/6/27 0027.
 */
public class Composite implements Component {
    List<Component> componentList = new ArrayList<Component>();

    public int add(Component component) {
        return componentList.add(component) ? 1 : 0;
    }

    public int remove(Component component) {
        return componentList.remove(component) ? 1 : 0;
    }

    public void display(String msg) {
       for(Component component:componentList){
           component.display(msg);
       }
    }
}
