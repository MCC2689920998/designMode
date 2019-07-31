package behavioral.visitor;

import behavioral.visitor.impl.Computer;
import behavioral.visitor.impl.Keyboard;
import behavioral.visitor.impl.Monitor;
import behavioral.visitor.impl.Mouse;


public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
