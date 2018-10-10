package week4.task1;

/**
 * Tao Ke Thua Hoa Qua.
 */
public class Tao extends HoaQua{
    /**
     * Constructor Tao
     * @param color
     * @param taste
     * @param price
     * @param ammount
     * @param where
     */
    Tao(String color,String taste,int price,int ammount,String where){
        this.setWhere(where);
        this.setGia(price);
        this.setColor(color);
        this.setVi(taste);
        this.setAmmount(ammount);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getColor() + "\n" + getWhere() + "\n" + getVi() + "\n" + getAmmount() + "\n" +getGia();
    }
}

