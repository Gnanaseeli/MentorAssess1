package mentorAssessment;
import java.util.Scanner;

public class Strobogrammatic {

    public boolean isStrobogrammatic(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char c1 = num.charAt(left);
            char c2 = num.charAt(right);

            if (c1 == '0' && c2 == '0' ||
                c1 == '1' && c2 == '1' ||
                c1 == '6' && c2 == '9' ||
                c1 == '8' && c2 == '8' ||
                c1 == '9' && c2 == '6') {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Strobogrammatic obj = new Strobogrammatic();

        System.out.print("Enter a number: ");
        String num = scanner.nextLine();

        if (obj.isStrobogrammatic(num)) {
            System.out.println(num + " is strobogrammatic.");
        } else {
            System.out.println(num + " is not strobogrammatic.");
        }
    }
}
