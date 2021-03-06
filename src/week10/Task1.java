package week10;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    List<String> getAllFunctions(File path) throws Exception {
        List<String> abc = new ArrayList<>();
        Scanner sc = new Scanner(path);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            int i = line.indexOf("static");
            if (i != -1) {
                if (line.endsWith("{")) {
                    int b = 1;
                    while (b!=0) {
                        String s = sc.nextLine();
                        line = line + "\n" + s;
                        if (s.indexOf("{")!=-1)
                            b++;
                        if (s.indexOf("}")!=-1)
                            b--;
                    }
                }
                abc.add(line);
            }


        }
        return abc;
    }
    List<String> getFunctionsName(File path) throws Exception {
        List<String> abc = new ArrayList<>();
        Scanner sc = new Scanner(path);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            int i = line.indexOf("static");
            if (i != -1) {
                    abc.add(line);

            }
        }
        return abc;
    }
    public String findFunctionByName(String name) throws Exception{
        int i = name.indexOf("(");
        String str = name.substring(0,i);
        List<String> list = new Task1().getFunctionsName(new File("src/week9/Utils.java"));
        for (int j = 0;j<list.size();j++){

            if (list.get(j).contains(str))
                return "true";
        }
        return "false";
    }
    public static void main(String [] abc) throws Exception{
        String a = "src/week9/Utils.java";

        List<String> list = new Task1().getAllFunctions(new File(a));
        for (int i = 0;i<list.size();i++){
           String str = list.get(i);

            System.out.println(str);
        }
        System.out.println(new Task1().findFunctionByName("addContentToFile(String)"));
    }
}
