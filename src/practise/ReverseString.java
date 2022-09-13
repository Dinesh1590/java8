package practise;

public class ReverseString {
    public static void main(String[] args) {

        String str = "abc def ghi";
        String[] strSplit = str.split(" ");

        String rev = "";
        for (String ref : strSplit) {
            rev = rev + " " + reverse(ref);
        }
        System.out.println(rev);


       /* String str="abcdefghi";
        String str1="";

        for(int i=2;i<str.length();i+=3)
        {
          str1=str1+str.charAt(i)+str.charAt(i-1)+str.charAt(i-2);
        }

        System.out.println(str1);*/
    }
    static String reverse(String name) {
        char ch[] = name.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }
}
