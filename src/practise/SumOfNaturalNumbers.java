package practise;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        System.out.println(naturalNumberRec(10));
    }

   /* static  int naturalNumberSum(int num)
    {
        int sum=0;
      for(int i=1;i<=num;i++)
      {
          sum=sum+i;
      }
      return sum;
    }*/

    /*static int sum = 0;
    static int naturalNumberRec(int num) {

        sum = sum + (num);
        if (num == 0) {
            return sum;
        }
        return naturalNumberRec(num - 1);
    }*/



    static int naturalNumberRec(int num)
    {
        if (num == 0) {
            return num;
        }
        return num+naturalNumberRec(num-1);
    }


}
