package week4.task1;

public class HoaQua {
    public String mau_sac;
    public int Gia_thanh; // dong/kg
    public String Nguon_goc;
    public int So_luong; // kg
    public String Vi;


    public void setColor(String n){
        this.mau_sac = n;
    }
    public String getColor(){
        return this.mau_sac;
    }
    public void setAmmount(int n){
        this.So_luong = n;
    }
    public int getAmmount(){
        return this.So_luong;
    }
    public void setWhere(String n){
        this.Nguon_goc = n;
    }
    public String getWhere(){
        return this.Nguon_goc;

    }
    public String getVi(){
        return this.Vi;
    }
    public void setVi(String n){
        this.Vi = n;
    }
    public int getGia(){
        return this.Gia_thanh;
    }
    public void setGia(int n){
        this.Gia_thanh = n;
    }

}
