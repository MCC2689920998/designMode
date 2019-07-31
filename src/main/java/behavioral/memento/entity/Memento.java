package behavioral.memento.entity;

/**
 * @Author MCC
 * @Create 2019/7/31 12:26
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
