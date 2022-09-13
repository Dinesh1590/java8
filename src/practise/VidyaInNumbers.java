package practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class VidyaInNumbers {

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";


        char[] ch = str.toCharArray();

        String s = "chandan";
        char[] ch1 = s.toCharArray();


        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {

            map.put(ch[i], i + 1);
        }
        for (int j = 0; j < ch1.length; j++)
        {
            for (Map.Entry<Character, Integer> ss : map.entrySet()) {


                if(ss.getKey()==ch1[j])
                {
                    System.out.println(ss.getKey()+"  :  "+ss.getValue());
                }
            }
        }
    }
}

