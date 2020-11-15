package Bai4;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Student() {
    }

    public Student(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public Student(String name, int age, String address, double gpa) {
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
        System.out.print("Nhap vao ma sinh vien: ");
        id = sc.nextInt();
        System.out.print("Nhap vao ten cua sinh vien: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Nhap vao tuoi cua sinh vien: ");
        age = sc.nextInt();
        System.out.print("Nhap vao dia chi cua sinh vien: ");
        sc.nextLine();
        address = sc.nextLine();
        System.out.print("Nhap vao diem trung binh cua sinh vien: ");
        gpa = sc.nextDouble();
    }

    public void Xuat(){
        System.out.println("MSV: " + id + ", Ten: " + name + ", Tuoi: " + age + ", Dia chi: " + address + ", GPA: " + gpa);
    }
}
