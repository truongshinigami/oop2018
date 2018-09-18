package week1;
import java.util.*;



public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    String [] students = new String[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
    Student a = new Student();
    Student b = new Student("Nguyen Van A", "17026547", "17026547@vnu.edu.vn");
    Student c = new Student(b);
    Student d = new Student();
    StudentManagement uet = new StudentManagement();
    Scanner in = new Scanner(System.in);
        String name = "truong anh";
        String id = "17020580";
        String group = "INT22042";
        String email = "1234@vnu.edu.vn";
        String name2 = "Pham Tuan B";
        String id2 = "17020495";
        String group2 = "INT22041";
        String email2= "17020495@vnu.edu.vn";
        a.setName(name);
        a.setGroup(group);
        a.setID(id);;
        a.setEmail(email);
        d.setName(name2);
        d.setID(id2);
        d.setID(email2);
        d.setGroup(group2);
        System.out.println(a.getName());
 //       System.out.println(a.getID());
  //      System.out.println(a.getGroup());
   //     System.out.println(a.getEmail());
        System.out.println(b.getName());
        System.out.println(c.getName());
        if (uet.sameGroup(c,b))
            System.out.println("Cung nhom");
        else
                System.out.println("Khac nhom");

    }
}
