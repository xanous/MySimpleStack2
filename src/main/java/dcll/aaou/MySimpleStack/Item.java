package dcll.aaou.MySimpleStack;

/**
 * Created by root on 14/04/16.
 */
public class Item {
    private Object value;

    public Item(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
