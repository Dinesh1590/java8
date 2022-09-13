package practise;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyQueue<E> extends Stack {

    @Override
    public E pop() {
        E obj;
        obj = peek();
        removeElementAt(0);

        return obj;
    }

    @Override
    public E peek() {
        int  len = size();

        if (len == 0)
            throw new EmptyStackException();
        return (E) elementAt(0);
    }
}
