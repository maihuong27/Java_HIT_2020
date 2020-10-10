package Lesson5;

public class RunMain {
    public static void main(String[] args) {
        Guns g1 = new Guns("Tinh", 500);
        Guns g2 = new Guns("Huy", 500);
        System.out.println(g1.getAmmoNumber() + " " + g2.getAmmoNumber());
        while(g1.getAmmoNumber() > 0 && g2.getAmmoNumber() > 0){
            g1.Load(40);
            g2.Load(50);
            g1.Shoot(80);
            g2.Shoot(100);
        }
        System.out.println(g1.getAmmoNumber() + " " + g2.getAmmoNumber());
        if (g1.getAmmoNumber() > 0){
            System.out.println("Tình thắng");
        } else {
            System.out.println("Huy thắng");
        }
    }
}
