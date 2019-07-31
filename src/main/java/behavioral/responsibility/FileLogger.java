package behavioral.responsibility;

/**
 * @Author MCC
 * @Create 2019/7/31 8:46
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
