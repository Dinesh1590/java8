package practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;

class Test implements Serializable {
    int i;
    String s;

    public Test(int i, String s) {
        this.i = i;
        this.s = s;
    }
}

public class A {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        Test a = new Test(20, "GeeksForGeeks");

        // Serializing 'a'
        /*FileOutputStream fos
                = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos
                = new ObjectOutputStream(fos);
        oos.writeObject(a);
*/
        // De-serializing 'a'
        FileInputStream fis
                = new FileInputStream("xyz.txt");
        //ObjectInputStream ois = new ObjectInputStream(fis);
        //Test b = (Test)ois.readObject(); // down-casting object
        try {

            int i = 0;
            while ((i = fis.read()) != -1) {

                System.out.print( i);
            }

            //   System.out.println(b.i + " " + b.s);

            // closing streams
            //  oos.close();
            //ois.close();


        } catch (Exception e) {
            System.out.println(e);
        }
        fis.close();
    }
}
