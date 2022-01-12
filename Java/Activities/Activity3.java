package activities;

public class Activity3 {
    public static void main(String[] args) {

        double sec = 1000000000;
        double Earth_sec = 31557600;
        double Mercury_sec = 0.2408467;
        double Venus_sec = 0.61519726;
        double Mars_sec = 1.8808158;
        double Jupiter_sec = 11.862615;
        double Saturn_sec = 29.447498;
        double Uranus_sec = 84.016846;
        double Neptune_sec = 164.79132;

        System.out.println("Age on Mercury: " + sec / Earth_sec / Mercury_sec);
        System.out.println("Age on Venus: " + sec / Earth_sec / Venus_sec);
        System.out.println("Age on Earth: " + sec / Earth_sec);
        System.out.println("Age on Mars: " + sec / Earth_sec / Mars_sec);
        System.out.println("Age on Jupiter: " + sec / Earth_sec / Jupiter_sec);
        System.out.println("Age on Saturn: " + sec / Earth_sec / Saturn_sec);
        System.out.println("Age on Uranus: " + sec / Earth_sec / Uranus_sec);
        System.out.println("Age on Neptune: " + sec / Earth_sec / Neptune_sec);
    }

}
