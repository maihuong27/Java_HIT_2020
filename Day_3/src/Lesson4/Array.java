package Lesson4;
import java.util.Scanner;

public class Array {
    private int[] arr;
    private int n;

    public Array(){

    }
    
    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public  void InputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        this.n = sc.nextInt();
        System.out.print("Nhập mảng: ");
        arr = new int[n];
        for (int i = 0; i < n; i++){
            this.arr[i] = sc.nextInt();
        }
    }

    public void Show(){
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public int Sum(){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }
}
