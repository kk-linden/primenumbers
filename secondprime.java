import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class secondprime {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String primeNumbers = "";
        for (int i = 5; i <= 100000; i += 2) {
            int counter = 0;
            for (int num = i; num >= 1; num = num-2) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(2 + " " + primeNumbers);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}

