package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();
        int n;

        do{
            System.out.print("Nhap vao n: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            switch (n){
                case 1:
                    Students x1 = new Students();
                    x1.inputStudent();
                    list.add(x1);
                    break;
                case 2:
                    if (list.size() == 0) System.out.println("Danh sach khong co hoc sinh");
                    else{
                        System.out.println("Nhap vao id muon sua: ");
                        int x2 = sc.nextInt();
                        for (int i = 0; i < list.size(); i++){
                            if (list.get(i).getId() == x2) {
                                System.out.print("Nhap ten muon sua: ");
                                sc.nextLine();
                                String name = sc.nextLine();
                                list.get(i).setName(name);

                                System.out.println("Nhap vao tuoi muon sua: ");
                                int age = sc.nextInt();
                                list.get(i).setAge(age);

                                System.out.println("Nhap vao dia chi muon sua: ");
                                sc.nextLine();
                                String address = sc.nextLine();
                                list.get(i).setAddress(address);

                                System.out.println("Nhap vao GPA muon sua: ");
                                int gpa = sc.nextInt();
                                list.get(i).setAge(gpa);
                            }
                        }
                    }

                    break;
                case 3:
                    if (list.size() == 0) System.out.println("Danh sach khong co hoc sinh");
                    else{
                        System.out.println("Nhap vao id muon xoa: ");
                        int x3 = sc.nextInt();
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).getId() == x3) {
                                list.remove(i);
                                break;
                            }
                        }
                    }

                    break;
                case 4:
                    if (list.size() == 0) System.out.println("Danh sach khong co hoc sinh");
                    else{
                        for (int i = 0; i < list.size(); i++) {
                            int min = i;
                            for (int j = 0; j < list.size(); j++) {
                                if (list.get(j).getGpa() < list.get(min).getGpa()) min = j;
                            }
                            Students t = list.get(i);
                            list.get(i).setStudents(list.get(min));
                            list.get(min).setStudents(t);
                        }
                    }

                    break;
                case 5:
                    if (list.size() == 0) System.out.println("Danh sach khong co hoc sinh");
                    else{
                        for (int i = 0; i < list.size(); i++){
                            int min = i;
                            for (int j = 0; j < list.size(); j++) {
                                if(list.get(i).getName().compareToIgnoreCase(list.get(min).getName()) > 0 ){
                                    min = j;
                                }
                                Students v = list.get(i);
                                list.get(i).setStudents(list.get(min));
                                list.get(min).setStudents(v);
                            }
                        }
                    }

                    break;
                case 6:
                    if (list.size() == 0) System.out.println("Danh sach khong co hoc sinh");
                    else{
                        for (int i = 0; i < list.size(); i++) {
                            list.get(i).ouputStudent();
                        }
                        break;
                    }

                case 0:
                    return;
            }
        } while (n != 0);
    }
}
