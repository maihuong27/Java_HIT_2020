package Bai2_Review;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao so phan tu mang: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        double [] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++){
            int max = i;
            for (int j = i+1; j<n; j++)
                if (a[j] > a[max]) max = j;
            double tmp = a[i];
            a[i] = a[max];
            a[max] = tmp;
        }

        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        int dem = 0;
        System.out.println("Cac so chinh phuong: ");
        for (int i = 0; i < n; i++){
            if (Math.sqrt(a[i]) == (int) Math.sqrt(a[i])) {
                System.out.print(a[i] + " ");
                dem++;
            }
        }
        System.out.println("So cac so chinh phuong la: " + dem);
    }
}
