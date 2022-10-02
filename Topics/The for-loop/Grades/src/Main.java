import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String grade = scanner.next();
            if (grade.equalsIgnoreCase("A")) {
                a++;
            } else if (grade.equalsIgnoreCase("B")) {
                b++;
            } else if (grade.equalsIgnoreCase("C")) {
                c++;
            } else {
                d++;
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);
    }
}