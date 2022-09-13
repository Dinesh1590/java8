package practise;

public class StringVowels {

    public static void main(String[] args) {

        String s="";

        System.out.println(findVowels(s));
    }

    private static int findVowels(String s) {

        char[] n=s.toCharArray();
        int count=0;

        for (int i = 0; i <n.length ; i++) {

            switch (n[i])
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': {
                    count++;
                    break;
                }
            }
        }
return count;
    }
}
