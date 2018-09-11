package week1;
import.java.util.*;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student

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
        return null; // xóa dòng này sau khi cài đặt
    }
}
