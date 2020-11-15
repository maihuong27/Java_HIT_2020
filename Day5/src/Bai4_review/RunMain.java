package Bai4_review;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static ArrayList<SinhVien> list = new ArrayList<>();
    public static void main(String[] args) {
        int n;
        do{
            System.out.println("/****************************************/");
            System.out.println("1.Add student");
            System.out.println("2.Edit student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort students by gpa.");
            System.out.println("5. Sort students by name.");
            System.out.println("6. Show students.");
            System.out.println("0. Exit.");
            System.out.println("/****************************************/");
            System.out.print("Nhap vao lua chon: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            switch (n) {
                case 1:
                    addStudent();
                    Show();
                    break;
                case 2:
                    editByID();
                    Show();
                    break;
                case 3:
                    deleteByID();
                    Show();
                    break;
                case 4:
                    sortByGPA();
                    Show();
                    break;
                case 5:
                    sortByName();
                    Show();
                    break;
                case 6:
                    Show();
                    break;
                case 0:
                    return;

                default:
                    System.out.println("Khong co chuc nang thoa man!");
                    break;

            }
        } while (n != 0);
    }

    private static void addStudent(){

        SinhVien x = new SinhVien();
        x.Nhap();
        boolean KT = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == x.getId()) {
                System.out.println("Sinh vien da ton tai!");
                return;
            }
        }
        list.add(x);
    }

    private static void editByID(){
        if (list.size() <= 0) {
            System.out.println("Khong co sinh vien nao de sua!");
            return;
        }
        System.out.println("Nhap vao ma sinh vien cua sinh vien muon sua: ");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        SinhVien S = new SinhVien();
        boolean KT = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == a) {
                S.Them();
                list.remove(i);
                list.add(i, S);
                KT = true;
            }
        }

        if (KT == false) System.out.println("Khong tim thay sinh vien theo yeu cau");
    }

    private static void deleteByID(){
        if (list.size() <= 0) {
            System.out.println("Khong co sinh vien nao de xoa!");
            return;
        }

        System.out.println("Nhap vao ma sinh vien cua sinh vien muon xoa: ");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        SinhVien S = new SinhVien();
        boolean KT = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == a){
                S.Them();
                list.remove(i);
                KT = true;
            }
        }
        if (KT == false) System.out.println("Khong co sinh vien theo yeu cau!");
    }

    private static void sortByGPA(){
        if (list.size() <= 0) {
            System.out.println("Khong co sinh vien nao de sap xep!");
            return;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size() ; j++) {
                if (list.get(min).getGpa() > list.get(j).getGpa()) min = j;
            }
            SinhVien a = list.get(i);
            list.set(i, list.get(min));
            list.set(min, a);
        }


//        if (list.size() == 0) System.out.println("Danh sach khong co hoc sinh");
//        else{
//            for (int i = 0; i < list.size(); i++) {
//                int min = i;
//                for (int j = 0; j < list.size(); j++) {
//                    if (list.get(j).getGpa() < list.get(min).getGpa()) min = j;
//                }
//                Students t = list.get(i);
//                list.get(i).setStudents(list.get(min));
//                list.get(min).setStudents(t);
//            }
//        }
    }

    private static void sortByName(){
        if (list.size() <= 0) {
            System.out.println("Khong co sinh vien nao de sap xep!");
            return;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(min).getName().compareToIgnoreCase(list.get(j).getName()) > 0){
                    min = j;
                }
            }
            SinhVien a = list.get(i);
            list.set(i, list.get(min));
            list.set(min, a);
        }
    }

    private static void Show(){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).Xuat();
        }
    }
}
