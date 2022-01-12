package activities;

abstract class Book {
    String title;
    //abstract method
    abstract void setTitle(String s);


    //concrete method
    String getTitle()
    {
        return title;
    }
}
