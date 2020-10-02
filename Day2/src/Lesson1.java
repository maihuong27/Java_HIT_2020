import java.util.Scanner;
public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double max = a;
        if (max < b)    max = b;
        if (max < c)    max = c;
        System.out.print(max);
    }
}
