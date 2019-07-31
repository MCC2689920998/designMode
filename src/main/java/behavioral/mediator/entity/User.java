package behavioral.mediator.entity;

import behavioral.mediator.ChatRoom;
import lombok.Data;

/**
 * @Author MCC
 * @Create 2019/7/31 11:40
 */
@Data
public class User {
    private String name;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
