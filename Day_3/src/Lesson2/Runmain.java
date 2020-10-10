package Lesson2;

public class Runmain {
    public static void main(String[] args) {
        Dog per = new Dog();
        per.InputName("Dog");
        for (int i = 1; i <= 3; i++){
            per.Bark();
            per.ShowMP();
        }
    }
}
