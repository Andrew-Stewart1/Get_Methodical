import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
         int moreItems = 0;
        double totalItems = 0;
            double cost = safeInputs.getRangedDouble(pipe, "What is the price of the item", (int) 0.50, (int) 9.99);
            totalItems += cost;
            moreItems = safeInputs.getYNConfirm(pipe, "Do you have more items?");
        System.out.println("Your total is" + totalItems);

        }
    }

