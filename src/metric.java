import java.util.Scanner;
public class metric {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meters=0;
        double miles;
        double feet;
        double inches;
        String trash ="";

        System.out.print("Please enter meters: ");
        if(in.hasNextInt())
        {
            meters = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input");
        }
        miles = meters/1609.344;
        feet = meters/0.3048;
        inches = meters * 39.3700787;

        System.out.println(meters + " equals to " + miles + " miles");
        System.out.println(meters + " equals to " + feet + " ft");
        System.out.println(meters + " equals to " + inches + " inches");


    }
}