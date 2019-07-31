package behavioral.memento;

import behavioral.memento.entity.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author MCC
 * @Create 2019/7/31 12:28
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}
