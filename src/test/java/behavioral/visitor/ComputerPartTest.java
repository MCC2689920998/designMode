package behavioral.visitor;

import behavioral.visitor.impl.Computer;
import behavioral.visitor.impl.ComputerPartDisplayVisitor;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerPartTest {
    @Test
    public void accept() throws Exception {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}