import java.util.Scanner;
import java.util.Arrays;
public class Task2 {
    public static int getEven (int[] arr) {
       int count = 0;

       for( int item : arr) {
           if(item % 2 == 0) {
               count++;
           }
       }
       return count;
    }
    public static int getOdd (int[] arr) {
        int count = 0;

        for(int item : arr) {
            if(item % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Random array : " + Arrays.toString(numbers));

            int even = getEven(numbers);
            int odd = getOdd(numbers);

        System.out.println("Even numbers : " + even);
        System.out.println("Odd numbers : " + odd);
        }
    }

