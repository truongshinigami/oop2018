package week10;

import java.util.Random;

public class Task2 {

    public static void bubblesort(double a[]){
        int n = a.length;
        for (int j=0;j<n;j++)
            for (int k=0;k<n-1-j;k++)
                if (a[k] > a[k+1]){
                    double temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                }
        System.out.println();
        System.out.print("Array after sort : ");
        for (int i = 0;i<a.length;i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String [] abc){
        double [] a = new double [1000];
        Random rand = new Random();
        for (int i = 0;i<a.length;i++) {

            a[i] = rand.nextDouble()*69;
        }
        System.out.print("Array before sort : ");
        for (int i = 0;i<a.length;i++)
            System.out.print(a[i] + " ");
        bubblesort(a);

    }
}
