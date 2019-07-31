package behavioral.observer;

import behavioral.observer.entity.Subject;

/**
 * @Author MCC
 * @Create 2019/7/31 12:45
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
