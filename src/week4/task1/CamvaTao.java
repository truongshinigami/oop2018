package week4.task1;

public class CamvaTao {
    public static void main(String[]abc){
        /**
         * Khoi tao 2 bien Cam & Tao
         */
        Cam a = new Cam("Cam","Chua & Ngot");
        Tao b = new Tao("Do","Ngot&Chua",20000,30,"Trung A");
        CamSanh c = new CamSanh(15000,30,"Bac Giang");
        CamCaoPhong d = new CamCaoPhong("Luc Nhat","Cao Phong",60,25000);
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
    }
}
