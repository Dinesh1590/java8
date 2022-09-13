package practise;

public class SmallestNumInArray {

    public static void main(String[] args) {
        int[] arr= {1,2,2,11};


        int min=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);

    }

}
