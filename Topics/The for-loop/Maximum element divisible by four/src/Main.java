import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int maxDivisibleBy4 = 0;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && number > maxDivisibleBy4) {
                maxDivisibleBy4 = number;
            }
        }

        System.out.println(maxDivisibleBy4);
    }
}