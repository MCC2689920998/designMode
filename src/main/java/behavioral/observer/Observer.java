package behavioral.observer;

import behavioral.observer.entity.Subject;

/**
 * @Author MCC
 * @Create 2019/7/31 12:43
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
