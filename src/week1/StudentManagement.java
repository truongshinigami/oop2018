package week1;
import java.util.*;



public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    Student [] students = new Student[100];


    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        // TODO:
        int n = students.length;
        System.out.println("Sinh vien thuoc nhom INT22041 : ");
        for (int i=0;i<n;i++){
            if (this.students[i].getGroup().equals("INT22041") && this.students[i].getName() != "Students"){

                System.out.println(this.students[i].getName() );
            }
        }
        System.out.println("Sinh vien thuoc nhom INT22042 : ");
        for (int i=0;i<n;i++){
            if (this.students[i].getGroup().equals("INT22042") && this.students[i].getName() != "Students"){
                               System.out.println(this.students[i].getName() );
            }
        }
        System.out.println();
    }

    void removeStudent(String id) {
        // TODO:
        int deleteloc = 0;
        int n = students.length;
        for (int i = 0; i < n; i++) {
            if (this.students[i].getID().equals(id)) {
                deleteloc = i;
                break;
            }

            for (int j = deleteloc; j < n-1; j++) {
                this.students[j] = this.students[j + 1];
            }
            this.students[n - 1] = null;
            n--;
        }
        for (int i=0;i<n;i++)
            if (students[i].getName() != "Students" )
               System.out.println(students[i].getName());
}

    public static void main(String[] args) {
        // TODO:
    Student a = new Student();
    Student b = new Student("Nguyen Van A", "17026547", "17026547@vnu.edu.vn");
    Student c = new Student(b);
    Student d = new Student();
    Student f = new Student();
    StudentManagement uet = new StudentManagement();
    Scanner in = new Scanner(System.in);
        String name = "Truong Anh";
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
        if (uet.sameGroup(a,b))
            System.out.println("Cung nhom");
        else
                System.out.println("Khac nhom");

        uet.students[0] = a;
        uet.students[1] = b;
        uet.students[2] = d;
        for (int i = 3;i<100;i++){
            uet.students[i] = f;
        }
        uet.studentsByGroup();
        uet.removeStudent("17020580");
    }
}
