package Demo;

public class RunMain {
    public static void main(String[] args) {
//        SinhVien x = new SinhVien();
//        x.hienThi();
//        x.stt(1);
        SinhVien[] arrSV =  new SinhVien[2];
        for (int i = 0; i < arrSV.length; i++){
            arrSV[i] = new SinhVien();
            arrSV[i].setHoTen("AAA" + i);
            arrSV[i].setMaSinhVien((i + 1));
            arrSV[i].InputInFor();
        }

        for (SinhVien sinhVien : arrSV){
            sinhVien.hienThi();

        }
    }
}
