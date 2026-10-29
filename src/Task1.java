import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
    public static double getAverage(int[] arr) {
        double sum = 0;
        /*
        for(int i = 0; i<arr.length; i++) {
            sum +=arr[i];
        } */
        for(int item:arr) {
            sum += item;
        }
        return sum  / arr.length;
    }
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];

        for(int i=0; i<numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }
        System.out.println("Array: " + Arrays.toString(numbers));

        double avg = getAverage(numbers);

        System.out.println("Average = " + avg);
        for(int item:numbers) {
            if(item>avg) {
                System.out.print(item + " ");
            }
        }

    }

}
