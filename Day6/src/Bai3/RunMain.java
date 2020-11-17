package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static ArrayList<News> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        do{
            System.out.println("***************CHUC NANG********************");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.println("********************************************");

            System.out.print("Nhap vao lua chon: ");
             x = sc.nextInt();

            if (x == 1) InsertNews();
            else if (x == 2) ViewListNew();
            else if (x == 3) AverageRate();
            else if (x != 4) System.out.println("Khong co chuc nang vua nhap");
        } while(x != 4);
    }

    public static void InsertNews(){
        News n = new News();
        n.Nhap();
       list.add(n);
    }

    public static void ViewListNew(){
        if (list.size() == 0) {
            System.out.println("Khong co thong tin de hien thi: ");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i).Display();
        }
    }

    public static void AverageRate(){
        if (list.size() == 0) {
            System.out.println("Khong co thong tin de hien thi: ");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i).Calculate();
            list.get(i).Display();
        }
    }
}
