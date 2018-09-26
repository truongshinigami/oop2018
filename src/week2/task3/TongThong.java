package week2.task3;

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

