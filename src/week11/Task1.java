package week11;

import java.util.Arrays;

public class Task1 {
    private <E> void swap ( E [] a,int i,int j) {
        E temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public <E extends Comparable<E>> void sorting(E [] a){
        for (int i = 0;i< a.length - 1;i++){
            // tìm phần tử nhỏ nhất
            int smallest = i;
            for (int j = i+1;j<a.length;j++){
                // compareTo trả về giá trị nhỏ hơn 0 khi a[j] > a[smallest]
                if (a[j].compareTo(a[smallest]) <= 0)
                    smallest = j;
            }
            // xếp phần tử nhỏ nhất lên đầu.
            swap (a,i,smallest);
        }


    }
    public static void main(String [] abc){
        Task1 test = new Task1();
        Integer [] arr1 = {10,6,9,7,4,3};
        String [] arr2 = {"abc","efg","tdg","dwa", "weg"};
        Character [] arr3 = {'a','b','c','d'};

        System.out.println("List before sort : " + Arrays.toString(arr1) );
        System.out.println("List before sort : " + Arrays.toString(arr2) );
        System.out.println("List before sort : " + Arrays.toString(arr3) );

        test.sorting(arr1);
        test.sorting(arr2);
        test.sorting(arr3);

        System.out.println("List after sort : " + Arrays.toString(arr1));
        System.out.println("List after sort : " + Arrays.toString(arr2));
        System.out.println("List after sort : " + Arrays.toString(arr3));
    }
}
