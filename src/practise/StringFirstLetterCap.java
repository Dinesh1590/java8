package practise;

public class StringFirstLetterCap {


    public static void main(String[] args) {

        String s = "jhgtuyjb iyh yh ui hiul hfgf ikjhn kjhki kjjnhjkhnjk jkjjkj jkk jhkjj";

        String[] s1 = s.split(" ");
        String fin = "";
        for (int i = 0; i < s1.length; i++) {
            fin = fin + " " + makeCap(s1[i]);
        }
        System.out.println(fin);
    }

    private static String makeCap(String s) {

        String[] cap = s.split("");

        cap[0] = cap[0].toUpperCase();
        String fin = "";
        for (int i = 0; i < cap.length; i++) {
            fin = fin + cap[i];
        }
        return fin;
    }
    void nn() {
    }
    void nn(int i) {
    }
}
