package week2.task2;


import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính

    int numerator,denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int ToiGian(int numerator,int denominator){
        int ucln = Task1.gcd(numerator,denominator);
        return ucln;
    }
        public Fraction add (Fraction other){
            // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới

            int new_numerator = (this.numerator * other.denominator) + (this.denominator * other.numerator);
            int new_denominator = (this.denominator * other.denominator);
            Fraction answer = new Fraction(new_numerator, new_denominator);
            int toigian = ToiGian(Math.abs(new_numerator),Math.abs(new_denominator));
            System.out.println(answer.numerator/toigian + "/" + answer.denominator/toigian);

            return null;
        }

        public Fraction subtract (Fraction other){

            // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction
            int new_numerator = (this.numerator * other.denominator) - (this.denominator * other.numerator);
            int new_denominator = (this.denominator * other.denominator);
            Fraction answer = new Fraction(new_numerator, new_denominator);
            int toigian = ToiGian(Math.abs(new_numerator),Math.abs(new_denominator));
            System.out.println((answer.numerator/toigian) + "/" + (answer.denominator/toigian));


            return null;
        }

        public Fraction multiply (Fraction other){
            // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới

            int new_numerator = (this.numerator * other.numerator);
            int new_denominator = (this.denominator * other.denominator);
            Fraction answer = new Fraction(new_numerator, new_denominator);
            int toigian = ToiGian(Math.abs(new_numerator),Math.abs(new_denominator));

            System.out.println((answer.numerator/toigian) + "/" + (answer.denominator/toigian));

        return null;
        }

        public Fraction divide (Fraction other){
            // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới

            int new_numerator = (this.numerator * other.denominator);
            int new_denominator = (this.denominator * other.numerator);
            Fraction answer = new Fraction(new_numerator, new_denominator);
            int toigian = ToiGian(Math.abs(new_numerator),Math.abs(new_denominator));
            System.out.println((answer.numerator/toigian) + "/" + (answer.denominator/toigian));
            return null;
        }


        public boolean equals(Object obj){
        Fraction other  = (Fraction) obj;
        int toigian_1 = ToiGian(this.numerator,this.denominator);
        int toigian_2 = ToiGian(other.numerator,other.denominator);
        if ((this.numerator/toigian_1) == (other.numerator/toigian_2) && (this.denominator/toigian_1) == (other.denominator/toigian_2)){
            return true;
        }
        else
        return false;
    }
    public static void main(String [] abc){
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction (6, 8);
        Fraction other = new Fraction (12,16);
        a.add(other);
        a.subtract(other);
        a.multiply(other);
        a.divide(other);
        if(b.equals(other))
            System.out.println("Hai phan so bang nhau");
        else
            System.out.println("Hai phan so khong bang nhau");
    }
    }


