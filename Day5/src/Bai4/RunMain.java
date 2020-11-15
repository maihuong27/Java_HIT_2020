package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public  static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        int n;
        do{
            System.out.println("/****************************************/");
            System.out.println("1. Add student.");
            System.out.println("2. Edit student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort students by gpa.");
            System.out.println("5. Sort students by name.");
            System.out.println("6. Show students.");
            System.out.println("0. Exit.");
            System.out.println("/****************************************/");
            System.out.println();
            System.out.print("Nhap vao thao tac muon thuc hien: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            switch (n){
                case 1:
                    add();
                    break;
                case 2:
                    editByID();
                    break;
                case 6:
                    show();
                    break;

                default:
                    System.out.println("Khong co chuc nang thoa man!");

            }
        } while(n != 0);
    }

    public static void add(){
        Student a = new Student();
        a.Nhap();
        for (int i = 0; i < list.size(); i++){
            if (a.getId() == list.get(i).getId()){
                System.out.println("Ma sinh vien da ton tai!");
                return;
            }
        }

        list.add(a);
        System.out.println("Them thanh cong!");
    }

    public static void editByID(){
        System.out.print("Nhap vao ma sinh vien muon chinh sua: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        boolean KT = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == x) {
                KT = true;
                break;
            }
        }

        if (KT == false) {
            System.out.println("Khong co sinh vien thoa man!");
            return;
        }
        else{
            Student a = new Student();
            a.Nhap();
            list.remove()
        }
    }

    public static void show(){
        if (list.size() < 1) {
            System.out.println("Khong co sinh vien nao de hien thi!");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).Xuat();
            System.out.println();
        }
    }
}
