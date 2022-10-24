import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        int birthYear = safeInputs.getRangedInt(pipe, "Enter your birth Year", 1950, 2010);
        int birthMonth = safeInputs.getRangedInt(pipe, "Enter your birth month", 1, 12);
        int birthDay = safeInputs.getRangedInt(pipe, "Enter your birth day", 1, 31);
        int birthHour = safeInputs.getRangedInt(pipe, "Enter your birth hour", 1, 24);
        int birthMinute = safeInputs.getRangedInt(pipe, "Enter your birthday minute", 1, 59);

        System.out.println("Your birth year is: " + birthYear);
        System.out.println("Your birth month is: " + birthMonth);
        System.out.println("Your birth day is: " + birthDay);
        System.out.println("Your birth hour is: " + birthHour);
        System.out.println("Your birth minute is: " + birthMinute);

    }
}
