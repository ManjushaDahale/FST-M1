package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] arrnum = {10, 77, 10, 54, -11, 10};
        int fixno = 10;
        int tot_sum = 30;

        System.out.println("Result is -" + result(arrnum, fixno, tot_sum));
    }
        public static boolean result( int[] n, int fixno, int tot_sum)
        {
            int temp = 0;
            for (int num : n) {
                if (num == fixno) {
                    temp += fixno;
                }
                if (temp > tot_sum) {
                    break;
                }
            }
            return temp == tot_sum;
        }

    }

