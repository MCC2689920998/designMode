package behavioral.iterator;

import behavioral.iterator.impl.NameRepository;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerTest {
    @Test
    public void getIterator() throws Exception {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

}