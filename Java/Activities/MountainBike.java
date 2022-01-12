package activities;

public class MountainBike extends Bicycle {
    public int seatheight;

    public MountainBike(int gears, int currentspeed, int startHeight)
    {
        super.gears=gears;
        super.currentspeed=currentspeed;

        seatheight=startHeight;
    }
    public void setHeight(int value)
    {
        seatheight=value;
    }

    public String bicycleDesc()
    {
        return (super.bicycleDesc() + "\nSeat height is - "+seatheight);
    }
}
