package activities;

class Bicycle implements BicycleParts, BicycleOperations {
    public int gears;
    public int currentspeed;

    //constructor
    public void Bicycle(int geras, int currentspeed) {
        this.gears = geras;
        this.currentspeed = currentspeed;
    }

    //methods
    public void applyBrake(int decrement)
    {
        currentspeed-=decrement;
        System.out.println("Current speed is - "+currentspeed);
    }

    public void speedUp(int increment)
    {
        currentspeed+= increment;
        System.out.println("Current speed is - "+currentspeed);
    }

    public String bicycleDesc()
    {
        return ("No of gears are- "+gears + "\nSpeed of bicycle is - "+currentspeed);
    }


}