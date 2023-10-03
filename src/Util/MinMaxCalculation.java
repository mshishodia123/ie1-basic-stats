public class MinMaxCalculation{

    public static double findMaximum(double... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }

        double max = numbers[0]; // Assume the first element is the maximum.

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update the maximum if a larger element is found.
            }
        }

        return max;
    }

    public static double findMinimum(double... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }

        double min = numbers[0]; // Assume the first element is the minimum.

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // Update the minimum if a smaller element is found.
            }
        }

        return min;
    }
}