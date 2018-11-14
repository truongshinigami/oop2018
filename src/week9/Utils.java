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
            BufferedWriter file2 = new BufferedWriter(new FileWriter(inputFile));
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
            file1.append("\n"+inStr);
            file1.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        File file1 = new File(folderPath+"/"+fileName);
        return file1.exists() ? file1 : null;
    }
    public static void main(String []abc){
        String a = "src/week9/test.txt";
        String folderPath = "src/week9";
        String fileNae = "abcd.txt";
        // doc file
       // readContentFromFile(a);
        //writeContentToFile(a);
        //addContentToFile(a);
        System.out.print(findFileByName(folderPath,fileNae));
    }
}
