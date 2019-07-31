package behavioral.mediator;

import behavioral.mediator.entity.User;

import java.util.Date;

/**
 * @Author MCC
 * @Create 2019/7/31 11:40
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }

}
