import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculator {
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
        long dayToNextBirthday =  ChronoUnit.DAYS.between(todayDate , nextBirthDay );
        printNewLine(" Days to next birthday " + dayToNextBirthday);
        Period period = Period.between(birthdayDate, todayDate);
        printNewLine("You are " + period.getYears() + " years and " + period.getMonths() + " months and " + period.getDays() + " days old");
    }
    private static void print(String message) {
        System.out.print("INFO: " + message);
    }
    private static void printNewLine(String message) {
        System.out.println("INFO: " + message);
    }

}
