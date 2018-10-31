package week7.task2;

import week7.task1.*;
import week7.task1.Square;

import java.io.*;

public class Task2 {
    public static void main(String[]abc){
        /**
         * NullPointerException
         */
        NullPointer a = new NullPointer();
        try{
            a.Nullpointer();
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        /**
         * ArithmeticException
         */
        Arithmetic b = new Arithmetic();
        try{
            b.ArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        /**
         * ArrayIndexOfBoundException
         */
        ArrayIndexOfBound c = new ArrayIndexOfBound();
        try{
            c.ArrayIndex();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOfBound");
        }
        /**
         * ClassCast Exception
         */
        try{
            Expression ex1 = new Numeral(2);
            Square sq = (Square) ex1;

        }catch (Exception e){
            System.out.println("ClassCastException");
        }
        /**
         * FilenotFoundException
         */
        try{
            BufferedReader rd = new BufferedReader(new FileReader(new File("abc.txt")));

        }catch(FileNotFoundException e){
            System.out.println("can't open file");
        }
        /**
         * IOException
         */
        try{
            BufferedReader rd = new BufferedReader(new FileReader(new File("abc.txt")));
            rd.readLine();
        }catch(IOException e){
            System.out.println("IOException");
        }
    }
}
