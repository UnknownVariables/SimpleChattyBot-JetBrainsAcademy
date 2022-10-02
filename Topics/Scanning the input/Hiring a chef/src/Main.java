import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstName = scanner.nextLine();
        String yearsOfExperience  = scanner.nextLine();
        String cuisinePreference = scanner.nextLine();
        System.out.print("The form for " + firstName);
        System.out.print(" is completed. We will contact you if we need a chef");
        System.out.print(" who cooks " + cuisinePreference + " dishes and has");
        System.out.println(" " + yearsOfExperience + " years of experience.");
    }
}