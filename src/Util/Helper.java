import java.util.*;

public class Helper{

    // Helper method
    public static void bubbleSort(double[] numArray) {
        int size = numArray.length;
        double hold = 0;

        // Iterate to bubble up O(n^2)
        for (int i = 0; i < size; i++) {
            // Second loop
            for (int j = 1; j < (size - j); j++) {
                // Bubble up
                if (numArray[j - 1] > numArray[j]) {
                    hold = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = hold;
                }
            }
        }
    }

    // Helper method
    public static double[] getArrayDouble(ArrayList<Double> doubles) {
        double[] result = new double[doubles.size()];

        // O(n) iteration to convert result
        for (int i = 0; i < doubles.size(); i++) {
            result[i] = doubles.get(i);
        }

        return result;
    }

    // Helper method
    public static double[] doInsertionSort(double[] input) {
        double hold;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    hold = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = hold;
                }
            }
        }
        return input;
    }

}
