package practise;

public class IntToBinary {


    public static void main(String[] args) {

        int a = 3;
        int b = 7;

        int s = a * b;
        int[] bin = new int[30];
        int index = 0;

        //System.out.println(Integer.toBinaryString(s));

        while (s > 0) {
            bin[index++] = s % 2;
            s /= 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(bin[i]);
        }
        System.out.println();
        String name="dinesh";
        String name1="dinesh";
        String name2="dinesh";
        String name3="dinesh";
        String name4="vinesh";
        String name5=new String("dinesh");
        String name6=new String("vinesh");
        String name7=new String("dinesh");
        String name8=new String("DINESH");

        System.out.println("hi    "+  name7.hashCode());
        System.out.println("hi    "+  name4.hashCode());


        name7=name+"ff";
        name4=name2;

        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());
        System.out.println(name4.hashCode());
        System.out.println(name5.hashCode());
        System.out.println(name6.hashCode());
        System.out.println(name7.hashCode());
        System.out.println(name8.hashCode());





        System.out.println(name7);
        System.out.println(name==name4);   //false   //f
        System.out.println(name.equals(name7));  //falsew   //t
        System.out.println(name6.equals(name4)); //false   //t
        System.out.println(name1.equals(name2));  //true   //t
        System.out.println(name5.equals(name8));  //false   //f
        System.out.println(name5==name7);   //false   //t
    }
}
