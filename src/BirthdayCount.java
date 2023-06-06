import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayCount {
	public static void main(String[] args) {
        printNewLine("Welcome to Birthday Count Down");
        Scanner scanner = new Scanner(System.in);
        print("What is your name: ");
        String name = scanner.next();
        print("What is your Birth Year: ");
        int year = scanner.nextInt();
        print("What is your Birth Month : ");
        int month = scanner.nextInt();
        print("What is your Birth Day : ");
        int day = scanner.nextInt();
        LocalDate birthdayDate = LocalDate.of(year, month, day);
        LocalDate todayDate = LocalDate.now();
        LocalDate nextBirthDay = LocalDate.of(todayDate.getYear(), month, day);
        if (nextBirthDay.isBefore(todayDate)){
            nextBirthDay = nextBirthDay.plusYears(1);
        }
        long years = ChronoUnit.YEARS.between(birthdayDate, todayDate );
        long months = todayDate.getMonthValue() - birthdayDate.getMonthValue();
        long days = todayDate.getDayOfMonth() - birthdayDate.getDayOfMonth();
        long dayToNextBirthday =  ChronoUnit.DAYS.between(todayDate , nextBirthDay );
        printNewLine(" Days to next birthday " + dayToNextBirthday);
        printNewLine("You are " + years + " years and " +months + " months and " +days + " days old");
    }
    private static void print(String message) {
        System.out.println("INFO: " + message);
    }
    private static void printNewLine(String message) {
        System.out.println("INFO: " + message);

}
}
