package behavioral.responsibility;

/**
 * @Author MCC
 * @Create 2019/7/31 8:45
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
