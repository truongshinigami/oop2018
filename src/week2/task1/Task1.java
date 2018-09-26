package week2.task1;

import java.util.*;


public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if (b == 0)
            return a;
        else
            return gcd(b,a%b);

    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void  main (String [] abc){

        System.out.println(gcd(3,10));
        System.out.println(fibonacci(5));

    }
}
