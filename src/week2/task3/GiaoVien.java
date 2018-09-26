package week2.task3;

public class GiaoVien {

        // Khai báo get set cho class
        String Name;
        int age;
        String id;

        GiaoVien(String Name, int age, String id) {
            this.Name = Name;
            this.age = age;
            this.id = id;
        }

        public boolean Retired(int age) {
            if (age >= 50)
                return true;
            else return false;
        }

        public String subject(String id) {
            if (id.equals("01")) {
                return "Toan";
            } else if (id.equals("02")) {
                return "Vat Ly";
            } else if (id.equals("03"))
                return "Hoa Hoc";
            else
                return "Sai ID";
        }

        public int workTime(int age) {
            return age - 25;
        }
    }

