package behavioral.observer;

import behavioral.observer.entity.Subject;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObserverTest {
    @Test
    public void update() throws Exception {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        subject.notifyAllObservers();
        System.out.println("Second state change: 10");
        subject.setState(10);
        subject.notifyAllObservers();

    }

}