package demo;
import java.util.ArrayList;

public class RunMain {
//Generic
   // public static <E> void show(E a) {
    //    System.out.println("a =  " + a);
    //}
    public static <T> void show(T a) {
        System.out.println("a = " + a);
    }
    public static void main(String[] args) {
        //show(0);
        //show(1.4);
        //show("abb");
        //ArrayList
        //ArrayList<String> list = new ArrayList();
        //list.add("a");
        //list.add("b");
        //list.add("c");
        //list.add(1, "d");
        //for (String i : list) {
            //System.out.print(i + " ");
        //}
        //System.out.println();
        //list.set(0, "d");
        //list.remove(1); // xoa phan tu thu i
        //list.clear(); // xoa het
        //for (int i = 0; i < list.size(); i++) {
            //System.out.print(list.get(i) + " ");

            ArrayList<Date> list = new ArrayList<>();
            /*Date x = new Date(3, 4, 1000);
            boolean kt = list.add(x);
            if (kt) {
                System.out.println("Them thanh cong");
            }
            list.add(new Date(1, 2, 2000));
            list.add(new Date(2, 3,2000));
            for (Date date:list){
                System.out.println(date);
            }

            for (int i = 0; i < 10; i++) {
                Date k = new Date();
                k.Input();
                list.add(k);
            }*/
        }
}
