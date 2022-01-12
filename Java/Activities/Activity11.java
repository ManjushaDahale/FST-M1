package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args)
    {
        HashMap<Integer , String> hm= new HashMap<Integer , String>();
        hm.put(1,"Red");
        hm.put(2,"Blue");
        hm.put(3,"Green");
        hm.put(4,"Pink");
        hm.put(5,"White");

        //Print
        System.out.println("Map is - "+hm);

        //Remove
        hm.remove(2);
        System.out.println("After removing - "+hm);

        //exist of green
        if(hm.containsValue("Green"))
        {
            System.out.println("Green is present");
        }
        else
        {
            System.out.println("Green is NOT present");
        }

        //size
        System.out.println("Size of Map is - "+hm.size());
    }
}
