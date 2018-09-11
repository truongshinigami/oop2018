package week1;
import java.util.*;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name = "abc";
    private String id = "123";
    private String group = "group 1";
    private String email = "abcdefgh@gmail.com";
    // TODO: khai báo các phương thức getter, setter cho Student
    Scanner in = new Scanner(System.in);
    public String getName(){
        return name;
    }

    public void setName(String n){
        n = getName();

    }

    public String getID(){

        return id;
    }

    public void setID(String n){
        n = getID();

    }

    public String getGroup(){

        return group;
    }

    public void setGroup(String n){
        n = getGroup();

    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String n){
        n = getEmail();
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        // TODO:
        return name + "\n" + id  + "\n" + group + "\n" + email + "\n";
    }
}
