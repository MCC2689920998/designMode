package behavioral.observer.entity;

import behavioral.observer.Observer;
import com.google.common.collect.Lists;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author MCC
 * @Create 2019/7/31 12:43
 */
@Data
public class Subject {
    private List<Observer> observers = Lists.newArrayList();
    private int state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
