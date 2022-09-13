package practise;

import java.util.HashMap;
import java.util.Map;

public class ArrayCount {
    public static void main(String[] args) {
        int[] ar=new int[]{1,2,3,3,4,3,1,2,4,4,2};
        Map<Integer,Integer> map=new HashMap<>();
        for (int arr:ar){

            if(map.containsKey(arr))
            {
                map.put(arr, map.get(arr)+1);
            }
            else {
                map.put(arr, 1);
            }
        }
        System.out.println(map.get(5));

        }
    }



