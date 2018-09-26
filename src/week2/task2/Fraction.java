package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính

    int numerator,denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

        public Fraction add (Fraction other){
            // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới

            int new_numerator = (this.numerator * other.denominator) + (this.denominator * other.numerator);
            int new_denominator = (this.denominator * other.denominator);
            Fraction answer = new Fraction(new_numerator, new_denominator);
            System.out.println(answer.numerator + "/" + answer.denominator);

            return null;
        }

        public Fraction subtract (Fraction other){

            // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction
            int new_numerator = (this.numerator * other.denominator) - (this.denominator * other.numerator);
            int new_denominator = (this.denominator * other.denominator);
            Fraction answer = new Fraction(new_numerator, new_denominator);
            System.out.println(answer.numerator + "/" + answer.denominator);


            return null;
        }

        public Fraction multiply (Fraction other){
            // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới

            int new_numerator = (this.numerator * other.numerator);
            int new_denominator = (this.denominator * other.denominator);
            Fraction answer = new Fraction(new_numerator, new_denominator);
            System.out.println(answer.numerator + "/" + answer.denominator);

        return null;
        }

        public Fraction divide (Fraction other){
            // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới

            int new_numerator = (this.numerator * other.denominator);
            int new_denominator = (this.denominator * other.numerator);
            Fraction answer = new Fraction(new_numerator, new_denominator);
            System.out.println(new_numerator + "/" + new_denominator);
            return null;
        }


    public static void main(String [] abc){
        Fraction a = new Fraction(1,2);
        Fraction other = new Fraction (3,4);
        a.add(other);
        a.subtract(other);
        a.multiply(other);
        a.divide(other);
    }
    }


