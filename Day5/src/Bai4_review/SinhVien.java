package Bai4_review;

import java.util.Scanner;

public class SinhVien {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao id: ");
        id = sc.nextInt();
        System.out.print("Nhap vao ten: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Nhap vao tuoi: ");
        age = sc.nextInt();
        System.out.print("Nhap vao dia chi: ");
        sc.nextLine();
        address = sc.nextLine();
        System.out.print("Nhap vao GPA: ");
        gpa = sc.nextDouble();
    }

    public void Them(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Nhap vao tuoi: ");
        age = sc.nextInt();
        System.out.print("Nhap vao dia chi: ");
        sc.nextLine();
        address = sc.nextLine();
        System.out.print("Nhap vao GPA: ");
        gpa = sc.nextDouble();
    }

    public void Xuat(){
        System.out.println("Ma sinh vien: " + id);
        System.out.println("Ten sinh vien: " + name);
        System.out.println("Tuoi sinh vien: " + age);
        System.out.println("Dia chi sinh vien: " + address);
        System.out.println("Diem GPA: " + gpa);
        System.out.println();
    }
}
