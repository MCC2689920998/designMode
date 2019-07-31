package behavioral.visitor.impl;

import behavioral.visitor.ComputerPart;
import behavioral.visitor.ComputerPartVisitor;

/**
 * @Author MCC
 * @Create 2019/7/31 15:42
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
