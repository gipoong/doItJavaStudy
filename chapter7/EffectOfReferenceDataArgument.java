package chapter7;

import java.util.Arrays;

public class EffectOfReferenceDataArgument {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3};
        modifyData(array);
        printArray(array);
    }

    public static void modifyData(int[] array) {
        array[0] = 4;
        array[1] = 5;
        array[2] = 6;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
