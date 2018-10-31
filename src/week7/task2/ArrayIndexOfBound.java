package week7.task2;

/**
 * Created by CCNE on 31/10/2018.
 */
public class ArrayIndexOfBound {
    public void ArrayIndex(){
        int array[] = new int[10];
        for (int i = 0;i<10;i++)
            array[i]=i;
        System.out.println(array[-1]);
    }
}
