package behavioral.mediator;

import behavioral.mediator.entity.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChatRoomTest {
    @Test
    public void showMessage() throws Exception {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}