import java.util.Scanner;

public class safeInputs {

    public static boolean getYNConfirm;
    private static int boolen;

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt) {

        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt);
            if(pipe.hasNextLine()){
                retVal = pipe.nextInt();
                pipe.nextLine();
            }else{
                trash = pipe.nextLine();
                System.out.println("You must enter an integer! You entered: " + trash);
            }
        } while (!done);

        return retVal;
    }
    public static int getDouble(Scanner pipe, String prompt) {

        int retVal = 0;
        int secVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt);
            if(pipe.hasNextLine()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
            }else{
                trash = pipe.nextLine();
                System.out.println("You must enter an integer! You entered: " + trash);
            }
        } while (!done);

        return retVal;
    }



    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {

        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt);
            if(pipe.hasNextLine()){
                retVal = pipe.nextInt();
                pipe.nextLine();

                if(retVal >= low && retVal <= high){
                    done = true;
                }else {
                    System.out.println("\nThe number is out of range [" + low + "-" + high +" ]");
                }
            }else{
                trash = pipe.nextLine();
                System.out.println("YOu must enter an integer! You entered: " + trash);
            }


        } while (!done);

        return retVal;
    }
    public static int getRangedDouble(Scanner pipe, String prompt, int low, int high) {

        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt);
            if(pipe.hasNextLine()){
                retVal = pipe.nextInt();
                pipe.nextLine();

                if(retVal >= low && retVal <= high){
                    done = true;
                }else {
                    System.out.println("\nThe number is out of range [" + low + "-" + high +" ]");
                }
            }else{
                trash = pipe.nextLine();
                System.out.println("YOu must enter an integer! You entered: " + trash);
            }


        } while (!done);

        return retVal;
    }
    public static int getYNConfirm(Scanner pipe, String prompt) {

        String trash = "";
        boolean done = false;

        String YN = "";
        do {
            System.out.println("\n" + prompt);
            if (pipe.hasNextLine()) {
                YN = String.valueOf(pipe.nextInt());
                pipe.nextLine();
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter Y or N! You entered: " + trash);
            }
        } while (!done);

        int String = 0;
        int boolen1 = boolen;
        return boolen1;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String ans = "";
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            if (pipe.hasNextLine())
                ans = pipe.nextLine();
        } while (ans == null||!ans.matches(regEx));
        return ans;

    }
    public static void prettyHeader(String msg){
        int starAmount=60;
        while(starAmount!=0)
        {System.out.print("*");
            starAmount--;}
        System.out.println();
        int stars=(60-msg.length())/2;
        int left=1;
        while(left<=stars)
        {System.out.print("*");
            left++;
        }
        System.out.print(msg);
        int right=0;
        while(right<=stars)
        {System.out.print("*");
            right++;
        }System.out.println();
        starAmount=60;
        while(starAmount!=0)
        {System.out.print("*");
            starAmount--;
        }
    }
}
