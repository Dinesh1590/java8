package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramProgram {

    public static void main(String[] args) {

        String str = "d";
        String str1 = "d";

        isAnagram(str, str1);
    }

    private static void isAnagram(String str, String str1) {
        String[] s = str.split("");
        String[] s1 = str1.split("");

        int count=0;
        int ss=0;
        int ss1=0;

        for(int i=0;i< s.length;i++)
        {
            for (int j = i+1; j < s.length; j++) {

                if(s[i].equals(s[j]))
                {
                    count++;
                    s[j]=",";
                }
            }
            if(!s[i].equals(","))
            {

            }
        }




    }
}
