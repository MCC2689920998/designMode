package behavioral.memento.entity;

import lombok.Data;

/**
 * @Author MCC
 * @Create 2019/7/31 12:27
 */
@Data
public class Originator {


    private String state;


    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
