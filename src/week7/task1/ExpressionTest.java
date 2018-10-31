package week7.task1;

/**
 * Created by CCNE on 31/10/2018.
 */
public class ExpressionTest {
    public static void main(String []abc){
        Numeral ten = new Numeral(10);
        Numeral three = new Numeral(3);
        Numeral two = new Numeral(2);
        Numeral one = new Numeral(1);

        Square sq = new Square(ten);
        // 20*3
        Multiplication mul = new Multiplication(two,three);
        //20+3;
        //20-3
        Subtration sub = new Subtration(sq,one);
        //20/3
        Division div = new Division(ten,one);

        Addition add = new Addition(sub,mul);
        Square sq1 = new Square(add);
        System.out.println(mul.evaluate());
        System.out.println(add.evaluate());
        System.out.println(sub.evaluate());
        System.out.println(div.evaluate());
        System.out.println(sq1.evaluate());
        try{
        int c = 20;
            int d = 0;
            System.out.println(20/0);
        }catch (Exception e){
            System.out.println("can't divide to 0");
        }
    }
}
