package week4.task1;

/**
 * Cam Cao Phong ke thua Cam
 */
public class CamCaoPhong extends Cam{
   CamCaoPhong(String color,String where,int ammount,int price){
       this.setColor(color);
       this.setWhere(where);
       this.setAmmount(ammount);
       this.setGia(price);
   }

    /**
     * Ham khai bao cac du lieu.
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "\n"+ getColor() + "\n" + Vi  + "\n" + getWhere() + "\n" + getAmmount() + "\n"+getGia();
    }
}
