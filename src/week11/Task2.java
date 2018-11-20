package week11;

public class Task2 {
    public  <E extends Comparable<E>> int max(E[] a){
        int maxIndex = 0;
        for (int i = 1;i<a.length;i++)
            // phan tu tai vi tri maxIndex nho hon phan tu tai vi tri i
            if (a[maxIndex].compareTo(a[i]) <0)
                maxIndex = i;
    return maxIndex;
    }
    public static void main(String [] abc){
        Task2 findmax = new Task2();
        Integer [] arr1 = {10,6,9,7,4,3};
        String [] arr2 = {"abc","efg","tdg","dwa", "weg"};
        Character [] arr3 = {'a','b','c','d'};

        System.out.println("Max of Integer : " + arr1[findmax.max(arr1)]);
        System.out.println("Max of String : " + arr2[findmax.max(arr2)]);
        System.out.println("Max of Character : " + arr3[findmax.max(arr3)]);
    }
}
