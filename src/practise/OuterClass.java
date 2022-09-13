package practise;

public class OuterClass {

    static int i = 0;

    void test() {
        System.out.println("i am inside outer class"+i);
    }
    public static class StaticClass {
        void test() {
            System.out.println("i am inside static class"+i);
        }

        public static class StaticClass1 {

            void test() {
                System.out.println("i am inside static class");
            }
        }

        public  class InnerClass1 {

            void test() {
                System.out.println("i am inside static class");
            }


            public class InnerClass {
                void test() {
                    System.out.println("i am inside inner class");
                }
            }
        }
    }

    public class InnerClass {
        void test() {
            System.out.println("i am inside inner class");
        }
    }

    public class InnerClass1 {
        void test() {
            System.out.println("i am inside inner class");
        }

    }

    public static class StaticClass1 {

        void test() {
            System.out.println("i am inside static class");
        }
    }
}

class Seperate {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.test();
        OuterClass.InnerClass ff = outerClass.new InnerClass();
        OuterClass.InnerClass ss = new OuterClass().new InnerClass();
        ff.test();
        // ss.test();
        OuterClass.StaticClass pp = new OuterClass.StaticClass();
        pp.test();
    }
}
