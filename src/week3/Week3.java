package week3;
import java.util.*;
public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất

       if (m>n)
           return m;
       else
           return n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min = array[0];
        for (int i=0;i<array.length;i++)
            if (min > array[i])
                min = array[i];
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight/(Math.pow(height,2));
        String s;
        if (BMI < 18.5)
             s = "Thieu Can";
         else if (BMI <=23.99 && BMI >= 18.5)
             s = "Binh Thuong";
         else if (BMI <= 24.99 && BMI >=24.99)
             s = "Thua Can";
        else
            s = "Beo Phi";
        return s;

    }
}
