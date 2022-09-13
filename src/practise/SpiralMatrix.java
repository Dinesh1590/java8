package practise;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if(i==0)
                System.out.print(arr[i][j]+" ");

                if(j==3 && i!=0)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

        for (int i = 3; i >=0; i--) {
            for (int j = 3; j >=0; j--) {

                if(i==3 && j!=3)
                    System.out.print(arr[i][j]+" ");

                if(j==0 && i!=0 && i!=3)
                {
                    System.out.print(arr[i][j]+" ");

                }
            }
        }

        for (int i = 1; i<3; i++) {
            for (int j = 1; j<3; j++) {

                if(i==1)
                    System.out.print(arr[i][j]+" ");

               if(j==2 && i!=1)
               {
                   System.out.print(arr[i][j]+" ");
               }
            }
        }
        System.out.print(arr[2][1]+" ");
    }
}
