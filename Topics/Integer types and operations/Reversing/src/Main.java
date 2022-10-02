import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number % 100 / 10;
        int thirdDigit = number % 10;
        System.out.println(thirdDigit * 100 + secondDigit * 10 + firstDigit);
    }
}