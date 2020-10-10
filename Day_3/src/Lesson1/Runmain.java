package Lesson1;

public class Runmain {
    public static void main(String[] args){
        Person DoanXinhGai = new Person();
        Person DiepBueDe = new Person();
        System.out.println("Name: " + DoanXinhGai.getName());
        System.out.println("Date of birth: " + DoanXinhGai.getDateOfBirth());
        System.out.println("Gender: " + DoanXinhGai.getGender());
        System.out.println("Hobby: " + DoanXinhGai.getHobby() + "\n");
        System.out.println("Name: " + DiepBueDe.getName());
        System.out.println("Date of birth: " + DiepBueDe.getDateOfBirth());
        System.out.println("Gender: " + DiepBueDe.getGender());
        System.out.println("Hobby: " + DiepBueDe.getHobby() + "\n");
    }
}
