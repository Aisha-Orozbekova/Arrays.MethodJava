import java.util.Scanner;
public class Task5 {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) {
                return false;
            }


        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        if (isSorted(numbers)) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
