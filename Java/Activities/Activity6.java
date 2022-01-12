package activities;

public class Activity6
{
    public static void main(String[] args)
    {
        Plane plane=new Plane(10);
        plane.onboard("Manjusha");
        plane.onboard("Veer");
        plane.onboard("Anushka");
        System.out.println("Plane tookoff at: "+plane.takeOff());
        System.out.println("Passengers boarded are : "+plane.getPassengers());
        plane.land();
        System.out.println("Plane landed at - "+plane.getLastTimeLanded());
        System.out.println("Passenfers after plane lands are - "+plane.getPassengers());
    }
}
