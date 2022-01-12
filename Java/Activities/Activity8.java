package activities;

public class Activity8 {
    public static void main(String[] args)
    {
        try{
            Activity8.exceptionTest("Print console");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Wont execute");
        }
        catch(CustomException e)
        {
            System.out.println("Inside Catch-"+e.getMessage());
        }
    }

    static void exceptionTest(String s) throws CustomException
    {
        if(s==null)
        {
            throw new CustomException("String value is Null");
        }
        else{
            System.out.println(s);
        }

    }
}
