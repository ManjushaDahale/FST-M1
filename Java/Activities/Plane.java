package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane
{
    private List<String> passengers;
    private int maxPassngers;
    private Date lastTookoffTime;
    private Date lastLandedTime;

 public Plane(int maxPassngers)
 {
     this.maxPassngers=maxPassngers;
     this.passengers= new ArrayList<String>();
 }

 public void onboard(String passenger)
 {
    this.passengers.add(passenger);
 }
public Date takeOff()
{
    this.lastTookoffTime=new Date();
    return lastTookoffTime;
}
public void  land()
{
    this.lastLandedTime=new Date();
    this.passengers.clear();
}

public Date getLastTimeLanded()
{
    return lastLandedTime;
}

public List<String> getPassengers()
{
    return passengers;
}

}