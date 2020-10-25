package Bai5;

public class RunMain {
    public static void main(String[] args) {
        LopHoc c = new LopHoc() ;
        c.inputLopHoc();
        c.outputLopHoc();

        System.out.println("So hoc sinh K14: " + c.k14());
        c.sapXep();
        c.outputLopHoc();
    }
}
