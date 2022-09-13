package practise;

public class CBIcode {
    public static void main(String[] args) {
        String s="doselect";

        String[] a=s.split("");

        String s1="abcdefghijklmnopqrstuvwxyz";
        System.out.println(s1.length());

        String[] a1=s1.split("");
        String emp="";

      for(int i=0;i<s.length();i++)
      {
          for(int j=0;j< a1.length;j++)
          {
              if(a[i].equals(a1[j]))
              {
                  emp=emp+a1[s1.length()-(j+1)];
              }
          }
      }
        System.out.println(emp);
    }
}
