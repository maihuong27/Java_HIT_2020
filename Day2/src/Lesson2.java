import java.util.Scanner;
public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int tmp;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min] > a[j])  min = j;
            }
            tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Min = " + a[0] + " ,Max = " + a[n-1]);
    }
}