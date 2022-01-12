package activities;
import java.util.Arrays;
public class Activity4 {

    static void ascen_sort(int array[])
    {
        int size=array.length, i;
        for( i=1;i<size;i++)
        {
            int key=array[i];
            int j=i-1;
            while(j>= 0 && key <array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j+1]=key;
            }
        }

    public static void main(String[] args)
    {
        int[] data={11,9,15,1,8,6};
        ascen_sort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
