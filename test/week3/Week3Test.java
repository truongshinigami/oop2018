package week3;
import org.junit.Assert;
import org.junit.Test;

public class Week3Test {

    @Test
    public void Test() {


        // TODO: Viết 5 testcase cho phương thức max()
        Assert.assertEquals(7,Week3.max(7,5));
        Assert.assertEquals(8,Week3.max(8,0));
        Assert.assertEquals(56,Week3.max(6,56));
        Assert.assertEquals(0,Week3.max(-5,0));
        Assert.assertEquals(83,Week3.max(-4,83));
        // TODO: Viết 5 testcase cho phương thức minOfArray()
        int arr1 [] = {1,2,3,4,5,6};
        int arr2 [] = {58,45,34,78,3};
        int arr3 [] = {2,5,7,3,34,52,6,57,78};
        int arr4 [] = {4,5,3,2,6,7,8,9};
        int arr5 [] = {1,2,6,7,4,5,3,8,9,10};
        Assert.assertEquals(1,Week3.minOfArray(arr1));
        Assert.assertEquals(3,Week3.minOfArray(arr2));
        Assert.assertEquals(2,Week3.minOfArray(arr3));
        Assert.assertEquals(2,Week3.minOfArray(arr4));
        Assert.assertEquals(1,Week3.minOfArray(arr5));
        // TODO: Viết 5 testcase cho phương thức calculateBMI()
        double weight1=60,height1=1.5,weight2=40,height2=1.5,weight3=60,height3=1.7,weight4=80,height4=1.67,weight5=60,height5=1.8;
        Assert.assertEquals("Beo Phi",Week3.calculateBMI(weight1,height1)); //26.6
        Assert.assertEquals("Thieu Can",Week3.calculateBMI(weight2,height2)); //17.7
        Assert.assertEquals("Binh Thuong",Week3.calculateBMI(weight3,height3)); //20.76
        Assert.assertEquals("Beo Phi",Week3.calculateBMI(weight4,height4)); //28.68
        Assert.assertEquals("Binh Thuong",Week3.calculateBMI(weight5,height5)); //18.51
    }
}
