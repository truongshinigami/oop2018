package week2.task1;
<<<<<<< HEAD
import java.util.*;
=======

>>>>>>> origin/master
public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
<<<<<<< HEAD
        if (b == 0)
            return a;
        else
            return gcd(b,a%b);

=======
        return 0;
>>>>>>> origin/master
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
<<<<<<< HEAD
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void  main (String [] abc){
        Scanner in = new Scanner(System.in);
        int a,b,n;
        a = in.nextInt();
        b = in.nextInt();
        n = in.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(fibonacci(n));

=======
        return 0;
>>>>>>> origin/master
    }
}
