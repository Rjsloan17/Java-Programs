import java.util.Arrays;

import java.util.Scanner;

public class Lab8_3 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            array[i] = input.nextInt();
        }
        input.close();

        int sum = alternatingSum(array);
        System.out.printf("Alternating sum is: %d\n", sum);
    }

    public static int alternatingSum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            } else if (i % 2 != 0) {
                sum += -array[i];
            }
        }

        return sum;
    }
}
