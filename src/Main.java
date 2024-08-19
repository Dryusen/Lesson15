import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DayAdvisor advisor = new DayAdvisor();
        Day day = null;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Введіть день тижня (наприклад, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY): ");
            String userInput = scanner.nextLine().toUpperCase();

            try {
                day = Day.valueOf(userInput);
                isValidInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Некоректний день тижня. Будь ласка, введіть правильне значення.");
            }
        }

        advisor.advise(day);
    }
}