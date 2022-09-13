package practise;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class LeadTest {

    public static void main(String[] args) {
        String input = "avvabsdbdbccdv";


        String[] s = input.split("");
        AtomicReference<String> s1 = new AtomicReference<>("");

        Arrays.stream(s).forEach(e -> {
                    int count = 0;
                    if (input.contains(e)) {

                        for (int i = 0; i < s.length; i++) {
                            if (s[i].equals(e)) {
                                count++;
                            }
                        }
                        if (count <= 2) {
                            s1.set(s1 + e);
                        }
                    }
                }
        );
        System.out.println(s1.get());
    }
}
