import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap mang so nguyen khong am: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int dem = 0, t = 2, v = 0;
        int[] SNT = new int[n];
        while (dem < n ) {
            if (KiemTra(t)) {
                SNT[v] = t;
                v++;
                dem++;
            }
            t++;
        }
//        for (int i = 0; i < n; i++)
//            System.out.println(SNT[i] + " ");

        int S = 0;
        for (int i = 0; i < n; i++) {
            if(KiemTra(a[i])) {
                S += a[i] + SNT[i] - i;
            } else {
                S += a[i];
            }
        }
        System.out.println("Ket qua = " + S);
    }


    public static boolean KiemTra(int a) {
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return a > 1;
    }

//    public static int MangSNT(int[] arr, int x){
//        int dem = 0, i = 2, j = 0;
//        while (dem < x) {
//            if (KiemTra(i)) {
//                arr[j] = i;
//                j++;
//            }
//            i++;
//        }
//    }

}
