package practise;

import java.util.Stack;

public class FlowersProgram {

    public static void main(String[] args) {
        String str = "{}()[{";

        String[] ss = str.split("");
        boolean b = true;
     /*   Stack<String>  stack=new Stack<>();

        for (String s : ss) {
            stack.push(s);
        }
*/
        for (int i = 0; i < ss.length; i=i+2) {

            if (check(ss[i]).equals(ss[i+1])) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println("string is valid");
        } else
            System.out.println("string is not valid");
    }

    static String check(String s) {
        switch (s) {
            case "(":
                return ")";
            case "{":
                return "}";
            case "[":
                return "]";
        }
        return null;
    }
}
