package behavioral.visitor.impl;

import behavioral.visitor.ComputerPart;
import behavioral.visitor.ComputerPartVisitor;

/**
 * @Author MCC
 * @Create 2019/7/31 15:43
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
