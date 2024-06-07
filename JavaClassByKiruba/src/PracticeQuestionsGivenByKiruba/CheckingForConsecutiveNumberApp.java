package PracticeQuestionsGivenByKiruba;

import java.util.Scanner;

public class CheckingForConsecutiveNumberApp {

	public static void main(String[] args) {
        CheckingForConsecutiveNumberApp app = new CheckingForConsecutiveNumberApp();
        app.readInput();
    }

    // Method to accept inputs and call inputValidator
    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by comma: ");
        String input = scanner.nextLine();
        inputValidator(input);
    }

    // Method to validate inputs and call checkForConsecutive
    private void inputValidator(String input) {
        boolean result = checkForConsecutive(input);

        if (result) {
            outputPrinter("Given numbers are Consecutive");
        } else {
            outputPrinter("Given numbers are not Consecutive");
        }
    }

    // Method to check if the given numbers are consecutive
    private boolean checkForConsecutive(String input) {
        String[] numbers = input.split(",");
        if (numbers.length <= 1) {
            // Single number or empty input is considered consecutive
            return true;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int current = Integer.parseInt(numbers[i]);
            int next = Integer.parseInt(numbers[i + 1]);

            if (Math.abs(current - next) != 1) {
                return false;
            }
        }
        return true;
    }

    // Method to print output
    private void outputPrinter(Object output) {
        System.out.println("Result:");
        System.out.println(output);
    }
}