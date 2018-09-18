package week1;
import java.util.*;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name ;
    private String id;
    private String group;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student
    Scanner in = new Scanner(System.in);
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;

    }

    public String getID(){

        return id;
    }

    public void setID(String n){
        id = n;

    }

    public String getGroup(){

        return group;
    }

    public void setGroup(String n){
       group = n;

    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String n){
       email = n;
    }
    /**
     * Constructor 1
     */
     Student() {
        // TODO:
        name = "Students";
        id = "000";
        group= "INT22041";
        email = "uet@vnu.edu.vn";

    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
      Student(String n, String sid, String em) {
      this.name = n;
      this.id = sid;
      this.email = em;
      this.group = "UET22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
         this.name = s.name;
         this.id = s.id;
         this.group = s.group;
         this.email = s.email;
    }

    String getInfo() {
        // TODO:
        return id  + "\n" + group + "\n" + email + "\n";
    }
}
