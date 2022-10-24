import java.util.Scanner;

public class Birthdays {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        int birthmonth = safeInputs.getRangedInt(pipe, "Enter your birthday month in number", 1, 12);

        System.out.println("Your birth month is: " + birthmonth);
        System.out.println("Your birth moth in words is: ");

        //int birthDay = safeInputs.getRangedInt(pipe, "What is the day you were dorn on?", low 1, high 31);
        String birthDay = "";
        System.out.println("The day you were born is: " + birthDay);
    }
}
