package week4.task1;

/**
 * Cam ke thua hoa qua
 */
public class Cam extends HoaQua {

    /**
     * Constructor Cam 1
     * @param color
     * @param taste
     */
    Cam(String color,String taste){
        this.setColor(color);
        this.setVi(taste);
    }
    /**
     * Constructor  Cam 2
     */
    Cam(){
        this.mau_sac = "cam";
        this.Vi = "Chua & Ngot";
    }

}
