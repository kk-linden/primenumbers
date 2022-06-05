import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class firstprime {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        for (i = 1; i <= 100000; i += 1) {
            int counter = 0;
            for (num = 100000; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100000 are:");
        System.out.println(2 + " " + primeNumbers);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}