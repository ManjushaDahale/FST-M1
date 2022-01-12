package activities;

public class Activity5 {
    public static void main(String[] args)
    {
        String title="Good Book";
        Book newNovel=new MyBook();
        //set Title
        newNovel.setTitle(title);
        System.out.println("Title is - "+newNovel.getTitle());
    }
}
