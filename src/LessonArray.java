import java.util.Random;
import java.util.Scanner;

public class LessonArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        int[] nums = new int[5];
        nums[0] = 12;
        nums[1] = 4;
        nums[2] = 5;
*/
/*
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i;
        }
        for (int i = 0; i < 1000; i++) {
           System.out.println(nums[i]) ;
        }
*/
/*        int x=-19;
        int[] nums = new int[21];
        for(int i=0;i<20;i++){
            nums[i]=x;
            x+=2;
        System.out.println(nums[i]);
        }
*/
/*        Random rand = new Random();
        int sizeOfArray = scan.nextInt();
        int[] nums = new int[sizeOfArray];
        for (int i = 0; i < nums.length; i++) {
            int y = rand.nextInt();
            nums[i] = y;
            if (y % 5 == 0) {
                System.out.println(nums[i]);
          }
        }
*/

/*        double[] nums = new double[100];
        for (int i = 0; i < 100; i++) {
            double u = Math.random() * 1000;
            int y = (int) u;
      nums[i]=u;
        }
        for (int i = 0; i < 100; i++) {
            if(nums[i]>=24.12 && nums[i]<=467.13){
                System.out.println(nums[i]);
            }
        }
*/
 /*       for (int x = 0; x < 10; x++) {

            for (int i = 0; i < 9; i++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
*/
/*
        int nums[] = new int[10];
        int m = 0;
        for (int i = 0; i < 10; i++) {
            double x = Math.random() * 100;
            nums[i] = (int) x;
        }
        for (int v = 0; v < 10; v++) {


            for (int k = 0; k < 9; k++) {
                if (nums[k] > nums[k + 1]) {
                    m = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = m;
                }
            }
        }
        for (int b = 0; b < 10; b++) {


            System.out.println(nums[b]);
        }
*/

    }
}