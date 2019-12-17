import java.util.Scanner;

public class Postive {
    public static void main(String[] args) {
            int a;
        Scanner y=new Scanner(System.in);
        System.out.print("Enter no:");
        a=y.nextInt();
        if (a>0)
        {
            System.out.print("postive number");
        }
         else if(a==0)
        {
            System.out.print("Zero number");
        }
        if (a<0)
        {
            System.out.print("Negative number");
        }
    }
}
