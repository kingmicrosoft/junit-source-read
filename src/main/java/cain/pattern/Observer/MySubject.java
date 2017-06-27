package cain.pattern.Observer;

public class MySubject extends AbstactSubject {

    public void operation() {
        notifyAllObser(100);
    }


}
