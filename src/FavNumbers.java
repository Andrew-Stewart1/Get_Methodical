import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        int favint = 0;
        int doublefavint = 0;
        Scanner in = new Scanner(System.in);
        favint = safeInputs.getInt(in, "Enter your favorite Integer");
        doublefavint = safeInputs.getDouble(in, "Enter your favorite double Integer");
    }
}
