package week4.task1;

/**
 * Cam Sanh ke thua Cam
 */
public class CamSanh extends Cam {
    CamSanh(int price,int ammount,String where){
        this.setAmmount(ammount);
        this.setGia(price);
        this.setWhere(where);
    }

    /**
     * Ham khai bao cac du lieu
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "\n" + this.mau_sac + "\n" + this.Vi + "\n" + getWhere() + "\n" + getAmmount() + "\n" + getGia();
    }
}
