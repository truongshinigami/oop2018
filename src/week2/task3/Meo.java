package week2.task3;

public class Meo {

        String Country;
        String fur_color;
        String fur_type;
        int weight;

        public Meo(String Country, String fur_color, String fur_type, int weight) {
            this.Country = Country;
            this.fur_color = fur_color;
            this.fur_type = fur_type;
            this.weight = weight;
        }

        public String Cat_type(String fur_color, String fur_type, String Country) {
            if (fur_type.equals("khong co") && Country.equals("Mexico"))
                return "Meo khong long Mexico";

            else if (fur_color.equals("trang") && Country.equals("Anh") && fur_type.equals("dai"))
                return "Meo long dai Anh";

            else if (Country.equals("Ba Tu") && fur_color.equals("trang") && fur_type.equals("dai"))
                return "Meo Ba Tu";
            else return "Meo khong co trong tu dien";

        }

        public boolean overWeight(int weight) {
            if (weight >= 30)
                return true;
            else
                return false;
        }

        public void furOrRealweight(String fur_type, int weight) {
            if (fur_type.equals("dai") && 10 <= weight && weight >= 20)
                System.out.println("Nhieu long,khong phai meo u");
            else
                System.out.println("Meo U");
        }


    }

