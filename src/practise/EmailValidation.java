package practise;

import java.util.Scanner;

public class EmailValidation {

    public static void main(String[] args) {

        // Scanner sc= new Scanner(System.in);

        // String str=sc.nextLine();

        String str = "dinesh@gmail.com";
        emailValidation(str);
    }

    private static void emailValidation(String str) {

        if (str.contains("@")) {
            String[] s = str.split("@");
            if (s[1].contains(".")) {
                String[] pp = s[1].split("\\.");

                if (pp[0].equalsIgnoreCase("gmail") && pp[1].equalsIgnoreCase("com")) {
                    System.out.println("email is valid");
                } else {
                    System.out.println("not valid");
                }
            } else {
                System.out.println("email is not valid");
            }
        } else {
            System.out.println("email is not valid");
        }
    }
}
