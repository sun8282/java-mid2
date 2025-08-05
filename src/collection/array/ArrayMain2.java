package collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println("arr = " + Arrays.toString(arr));

        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        int index = 2;
        int value = 4;

        addAtIndex(arr, index, value);
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i -1];
        }
        arr[index] = value;
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i -1];
        }
        arr[0] = newValue;
    }
}
