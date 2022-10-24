import java.util.Scanner;

public class ATM {
    static Scanner in =new Scanner(System.in);
    static double balance = 1000;

    public static void main(String[] args) {

        System.out.println("Select an option to proceed, W - withdraw, D - Deposit, C - check balance, Q - quit");

        String option = in.nextLine();
        option = option.toUpperCase();

        switch (option){
            case "W":
                withdraw();
                break;
            case "D":
                deposit();
                break;
            case "C":
                checkBalance();
                break;
            case "Q":
                quit();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    private static void deposit(){
        System.out.println("How much would you like to deposit");
        int depositAmount = in.nextInt();
        balance = balance + depositAmount;
        System.out.println("You deposited " + depositAmount + " Your new balance is: " + balance);
    }
    public static void withdraw(){
        System.out.println("How much would you like to withdraw");
        int withdrawAmount = in.nextInt();
        balance = balance + withdrawAmount();
        System.out.println("You withdrew " + withdrawAmount + " Your new balance is: " + balance);

    }

    private static double withdrawAmount() {
        return 0;
    }

    public static void checkBalance(){
        System.out.println("The money left in your account is " + balance);


    }
    public static void quit(){
        System.out.println("Goodbye");
        System.exit(0);
    }
}

