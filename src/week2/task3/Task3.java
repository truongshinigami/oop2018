package week2.task3;


public class Task3 {
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


    public class Meo{
            String Country;
            String fur_color;
            String fur_type;
            int weight;
            public  Meo(String Country,String fur_color,String fur_type,int weight){
                this.Country = Country;
                this.fur_color = fur_color;
                this.fur_type = fur_type;
                this.weight = weight;
            }
            public String Cat_type(String  fur_color,String fur_type , String Country){
                if (fur_type.equals("khong co") && Country.equals("Mexico"))
                    return "Meo khong long Mexico";

                else if (fur_color.equals("trang") && Country.equals("Anh") && fur_type.equals("dai"))
                    return "Meo long dai Anh";

                 else if (Country.equals("Ba Tu") && fur_color.equals("trang") && fur_type.equals("dai"))
                     return "Meo Ba Tu";
                         else return "Meo khong co trong tu dien";

            }
            public boolean overWeight(int weight){
                if (weight >=30)
                    return true;
                else
                    return false;
            }
            public void furOrRealweight(String fur_type,int weight){
                if (fur_type.equals("dai") && 10 <= weight && weight >=20)
                    System.out.println("Nhieu long,khong phai meo u");
                    else
                        System.out.println("Meo U");
                }


        }
        public class TongThong {
            String Country;
            int NhiemKi;
            int NamNhiemKi;

            public TongThong(String Country,int NhiemKi, int NamNhiemKi){
                this.Country = Country;
                this.NhiemKi = NhiemKi;
                this.NamNhiemKi = NamNhiemKi;
            }

            public void NuocNao(String Country) {
                System.out.println("Tong thong nuoc" + Country);
            }

            public int YearLeft(int NamNhiemKi) {
                return 4 - NamNhiemKi;
            }

            public boolean TiepTucTranhCu(int NhiemKi) {
                if (NhiemKi <= 2)
                    return true;
                else
                    return false;
            }
        }





    }


//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
