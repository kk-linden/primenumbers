import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class thirdprime {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 99999; i > 1; i = i - 2) {
            for (int n = 3; n < i; n++) {
                if (i % n ==0) {
                    break;
                }
                if(n==i-1) {
                    System.out.println(i);
                    System.out.println(System.currentTimeMillis() - s);
                    System.exit(0);
                }
            }
        }
    }
}