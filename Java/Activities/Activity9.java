package activities;

import java.util.ArrayList;

public class Activity9
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");
        list.add("grapes");
        list.add("Banana");

        //Print all
        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("3rd one is"+ list.get(2));
        if(list.contains("grapes"))
        {
            System.out.println("grapes is present in list");
        }
        //to print size
        System.out.println("Size of array is-"+ list.size());
        //remove element
        list.remove("grapes");
        if(list.contains("grapes"))
        {
            System.out.println("grapes is present in list");
        }
        else
        {
            System.out.println("grapes is removed from list");
        }

    }
}
