package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();
        //Add elements
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");

        //print size
        System.out.println("Size of hashset is - "+hs.size());

        //Remove element
        System.out.println("Removing E from set: "+hs.remove("E"));
        //Try to remove which is not present
        if(hs.remove("N"))
        {
            System.out.println("N is removed");
        }
        else
        {
            System.out.println("N is not part of hashset");
        }

        //serach of element
        System.out.println("Check for presenece of A "+hs.contains("A"));
        //updated hashset
        System.out.println("Updated hashset is -" +hs);
    }
}
