import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input = scanner.nextLine();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        System.out.println(input.substring(startIndex, endIndex + 1));
    }
}