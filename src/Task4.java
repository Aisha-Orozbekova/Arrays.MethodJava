import java.util.Scanner;
public class Task4 {
    public static int getMax(int[] arr) {
        int max = arr[0];

        for(int item : arr){
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
    public static int getMin(int[] arr) {
        int min = arr[0];

        for(int item : arr) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int [] numbers = new int[n];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        int min = getMin(numbers);
        int max = getMax(numbers);

        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);

    }

}
