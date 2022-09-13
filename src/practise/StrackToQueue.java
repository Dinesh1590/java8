package practise;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StrackToQueue {

    public static void main(String[] args) {
       /* Stack<Integer> list=new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
*/

        MyQueue s = new MyQueue();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);

    }
}


