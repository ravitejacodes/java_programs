package java_pratice_notes_Strings;


import java.util.Arrays;

public class Sort_Bytes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (CountBits(arr[j]) > CountBits(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array (based on the number of 1's): " + Arrays.toString(arr));
    }

    static int CountBits(int b) {
        int count = 0;
        while (b > 0) {
            if (b % 2 == 1) {
                count++;
            }
            b /= 2;
        }
        return count;
    }
}
