import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int peanutButterCupsCount = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean isSuccessfulParty = isWeekend && peanutButterCupsCount >= 15 && peanutButterCupsCount <= 25
                || !isWeekend && peanutButterCupsCount >= 10 && peanutButterCupsCount <= 20;
        System.out.println(isSuccessfulParty);
    }
}