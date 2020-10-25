package keThua;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String dob;

    public Person() {
    }

    public Person(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                '}';
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        dob = sc.nextLine();
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
