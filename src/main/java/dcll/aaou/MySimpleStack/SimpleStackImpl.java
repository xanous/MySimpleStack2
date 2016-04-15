package dcll.aaou.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by root on 14/04/16.
 * exg #2
 */
public class SimpleStackImpl implements SimpleStack {

    Stack<Object> stack = new Stack<Object>();

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) stack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) stack.pop();
    }
}
