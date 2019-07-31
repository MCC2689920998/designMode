package behavioral.template;

/**
 * @Author MCC
 * @Create 2019/7/31 15:14
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
