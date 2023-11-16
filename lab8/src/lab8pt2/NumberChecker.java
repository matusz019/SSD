package lab8pt2;

public class NumberChecker {
    public int findMax(Integer[] numbers) {
        // Check if the array is not empty
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Initialize max with the first element of the array
        int max = numbers[0];

        // Iterate through the array to find the maximum number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
}
