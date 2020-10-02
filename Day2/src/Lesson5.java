import java.util.Scanner;
public class Lesson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String ch = sc.next();

        int count = 0, Sum = 0;
        for (int i = 0; i < ch.length(); i++) {
            if (Character.isDigit(ch.charAt(i))) {
                count++;
                Sum += ch.charAt(i) - 48;
            }
        }
        System.out.println(Sum + " " + count);
        System.out.println((double) Sum / count);
    }
}
