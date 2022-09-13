package practise;

public class SingletonClass1 {
    private static SingletonClass1 singletonClass1;
    private SingletonClass1() {

    }
    public static SingletonClass1 display() {
        if (singletonClass1 == null) {
            singletonClass1 = new SingletonClass1();
        }
        return singletonClass1;
    }
}

class Singleton {
    public static void main(String[] args) {
       SingletonClass1 sc= SingletonClass1.display();
        SingletonClass1 sc1= SingletonClass1.display();
        System.out.println(sc);
        System.out.println(sc1);
    }
}