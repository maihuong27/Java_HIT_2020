package Bai4;
import java.util.Scanner;

public class Students {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Students() {
    }

    public Students(int id, String name, int age, String address, int gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public Students setStudents(Students s) {
        this.gpa = s.gpa;
        this.address = s.address;
        this.age = s.age;
        this.id = s.id;
        this.name = s.name;
        return this;
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

    public void inputStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao ten: ");
        name = sc.nextLine();
        System.out.print("Nhap vao tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao dia chi: ");
        address = sc.nextLine();
        System.out.print("Nhap vao gpa: ");
        gpa = sc.nextDouble();
    }

    public void ouputStudent(){
        System.out.println("ID: " + id);
        System.out.println("Ho ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + address);
        System.out.println("GPA: " + gpa);
    }
}
