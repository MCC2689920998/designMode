package behavioral.nullobject;

/**
 * @Author MCC
 * @Create 2019/7/31 14:16
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }

}
