package practise;


import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {

        College col = new College(1, "dinesh", "5746846465465", "hyd", 500079);
        College col1 = new College(2, "sh", "5746846465465", "hjkj", 500080);
        College col2 = new College(3, "h", "5746846465465", "hyd", 5000790);
        College col3 = new College(4, "esh", "5746846465465", "hyd", 5000769);
        College col4 = new College(5, "nesh", "5746846465465", "hyd", 509);

        College[] objects = new College[]{col, col1, col2, col3, col4};

        findCollegeWithMaximumPincode(objects);
        searchCollegeByAddress(objects,"pur");

    }

    static College findCollegeWithMaximumPincode(College[] col) {

        System.out.println(Arrays.asList(col));

        Arrays.sort(col, new Comparator<College>() {
            @Override
            public int compare(College o1, College o2) {
               if(o1.pincode> o2.pincode){
                   return -1;
               }
               else return 1;
            }
        });



        System.out.println(Arrays.asList(col));
        return col[col.length-1];
    }

  static College searchCollegeByAddress(College[] col,String add) {



       return null;
    }

}
