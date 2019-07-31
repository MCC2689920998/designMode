package behavioral.observer;

import behavioral.observer.entity.Subject;

/**
 * @Author MCC
 * @Create 2019/7/31 12:45
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
