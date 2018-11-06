package week9;

import java.util.*;

import java.io.*;

public class Utils {
    // đọc các dòng từ file
    public static String readContentFromFile(String path){
        try{
        File inputFile = new File(path);
        BufferedReader a = new BufferedReader(new FileReader(inputFile));
        String line;
        while ((line = a.readLine()) != null)
        {
            System.out.println(line);
        }
    } catch (Exception e){
        e.printStackTrace();
        }
        return "success";
    }
    // Viết line mới vào file
    public static void writeContentToFile(String path){
        Scanner in = new Scanner(System.in);
        String inStr = in.nextLine();
        try{
            File inputFile = new File(path);
            BufferedWriter file1 = new BufferedWriter(new FileWriter(inputFile,true));
            BufferedWriter file2 = new BufferedWriter(new FileWriter(inputFile,true));
            file1.write("");
            file1.close();
            file2.write(inStr);
            file2.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * thêm line vào file
     */
    public static void addContentToFile(String path){
        Scanner in = new Scanner(System.in);
        String inStr = in.nextLine();
        try{
            File inputFile = new File(path);
            BufferedWriter file1 = new BufferedWriter(new FileWriter(inputFile,true));
            file1.append(inStr);
            file1.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
