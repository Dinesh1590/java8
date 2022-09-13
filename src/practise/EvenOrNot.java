package practise;

import java.util.function.Predicate;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class EvenOrNot {


    public static void main(String[] args) {
        Predicate<Integer> num = e -> e % 2 == 0;
        Predicate<String> name = e -> e.equals(reverse(e));
        EvenOrNot n = new EvenOrNot();
        System.out.println("number is : " + num.test(10));
        System.out.println("name is palindrome : " + name.test("madam"));

    }

    static String  reverse(String name) {
        char ch[] = name.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;

    }
}



