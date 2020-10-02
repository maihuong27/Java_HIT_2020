import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println("Chuoi truoc khi chuan hoa: ");
        System.out.println(str);
        System.out.println("Chuoi sau khi chuan hoa: ");
        System.out.println(ChuanHoa(str));
    }

    public static String ChuanHoa(String s) {
        s = s.toLowerCase();
        String[] s1;
        s1 = s.split(" ");
        String s2 = "";

        for (String i :  s1) {
            if (!i.equals("") && !i.equals(null)){
                s2 += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
            }
        }

        if (!s2.equals("") && !s2.equals(null)) {
            s2 = s2.substring(0, s2.length() - 1);
        }
//        s2 = s2.trim();
        return s2;
    }

}

