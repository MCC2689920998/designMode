package behavioral.responsibility;

/**
 * @Author MCC
 * @Create 2019/7/31 8:45
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
