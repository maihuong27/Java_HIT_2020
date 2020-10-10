package Lesson4;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();

        arr1.InputData();
        arr2.InputData();

        double TBC1, TBC2;
        TBC1 = (double)arr1.Sum()/arr1.getN();
        TBC2 = (double)arr2.Sum()/arr2.getN();
        if(TBC1 > TBC2) {
            System.out.println("TBC mang 1 lon hon TBC mang 2");
        } else if (TBC1 < TBC2){
            System.out.println("TBC mang 2 lon hon TBC mang 1");
        } else {
            System.out.println("Hi");
        }
    }
}
