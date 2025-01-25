package Task;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10; // Example number 1
        int num2 = 20; // Example number 2

        // Find the maximum of the two numbers
        int max = findMax(num1, num2);

        // Print the maximum value
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
    }

    // Method to find the maximum of two numbers
    public static int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
