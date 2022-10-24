import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);


        String ssn = safeInputs.getRegExString(pipe, "Please enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("SSN:" + ssn);

        String ucMnumber = safeInputs.getRegExString(pipe, "Please enter your UC M number", "(M|m)\\d{5}");
        System.out.println("UC student M number:" + ucMnumber);

        String menuOption = safeInputs.getRegExString(pipe, "Please enter your menu option", "[OoSsVvQq]");
        System.out.println("Menu choice:" + menuOption);
    }
}
