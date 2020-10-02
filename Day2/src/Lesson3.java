import java.util.Scanner;
public class Lesson3 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Lựa chọn công việc cần làm: ");
        System.out.println("1. Tạo và nhập mảng với n số nguyên");
        System.out.println("2. Hiển thị mảng vừa tạo");
        System.out.println("3. Thêm một phần tử vào vị trí k (k nhập từ bàn phím)");
        System.out.println("4. Xóa một phần tử ở vị trí k (k nhập từ bàn phím)");
        System.out.println("5. Đảo ngược mảng");
        System.out.println("6. Hiển thị phần tử a[i] và các số chia hết cho a[i]");
        System.out.println("7. Thoát");


        int x = sc.nextInt();
        int[] arr = new int[n + 1];

        if (x == 1) {
            System.out.println("Nhập mảng: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Lựa chọn công việc cần làm: ");
            x = sc.nextInt();
        }

        else if(x == 2) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Lựa chọn công việc cần làm: ");
            x = sc.nextInt();
        }

        if (x == 3) {
            System.out.print("Nhập vào vị trí k: ");
            int k = sc.nextInt();
            System.out.print("Nhập vào giá trị chèn: ");
            int u = sc.nextInt();


            for (int i = n; i >= k; i--){
                arr[i] = arr[i - 1];
            }
            arr[k-1] = u;

            for (int i = 0; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Lựa chọn công việc cần làm: ");
            x = sc.nextInt();
        }

        else if(x == 4) {
            System.out.print("Nhập vào vị trí k: ");
            int k = sc.nextInt();

            for (int i = k - 1; i < n; i++) {
                arr[i] = arr[i + 1];
            }

            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Lựa chọn công việc cần làm: ");
            x = sc.nextInt();
        }
        else if(x == 5) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
        else if(x == 6) {
            System.out.println(arr[1]);
            for (int i = 0; i < n; i++) {
                if (arr[i] % arr[1] == 0 && arr[i] != arr[1]) {
                    System.out.println(arr[i] + " ");
                }
            }
            System.out.println();
            System.out.println("Lựa chọn công việc cần làm: ");
            x = sc.nextInt();
        }
        else if(x == 7) {
            System.exit(0);
        }
    }
}

