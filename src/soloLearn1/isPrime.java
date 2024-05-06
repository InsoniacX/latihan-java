package soloLearn1;

import java.util.Scanner;

public class isPrime {
    static String sIsPrime(int number) {
        String sResult = "";
        for (int i = 2; i <= number / 2; ++i) {
            /*
             * condition for non prime number,
             * don't change condition
             */
            if (number % i == 0) {
                sResult = "Isn't prime";
            } else {
                sResult  = "Is prime";
            }
        }
        // return the result
        return sResult;
    }

    public static void main(String[] args) {
        Scanner scRead = new Scanner(System.in);
        int number = scRead.nextInt();
        String sOutput = sIsPrime(number);
        System.out.println(sOutput);
    }
}
