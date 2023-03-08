package mentorAssessment;
import java.util.Scanner;

public class NumbertoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 999: ");
        int number = scanner.nextInt();
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (number == 0) {
            System.out.println("zero");
        } else if (number < 0 || number > 999) {
            System.out.println("Invalid input!");
        } else if (number >= 100) {
            System.out.print(ones[number / 100] + " hundred ");
            if (number % 100 != 0) {
                System.out.print("and ");
            }
            number %= 100;
        }
        if (number >= 20) {
            System.out.print(tens[number / 10] + " ");
            number %= 10;
        }
        if (number > 0) {
            System.out.print(ones[number]);
        }
    }
}
