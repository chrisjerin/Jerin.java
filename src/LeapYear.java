import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int x;
        Scanner y=new Scanner(System.in);
        System.out.print("Enter year:8");
        x=y.nextInt();
        if(x%4==0)
        {
            System.out.print("Leap year");
        }
        else
        {
            System.out.print("Non-Leap year");
        }
    }
}
