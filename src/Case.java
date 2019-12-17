import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        int A,B,C,X;
        Scanner y=new Scanner(System.in);
        System.out.print("Enter A:");
        A=y.nextInt();
        System.out.print("Enter B:");
        B=y.nextInt();
        System.out.print("1.ADD\t2.SUB\t3.MUL\t4.DIV\n");
        System.out.print("Enter your choice:");
        X=y.nextInt();
        switch (X) {
            case (1):
                C = A + B;
                System.out.print("the sum of " + A+" + " + B+" is " + C+"");
                break;

            case (2):
                C = A - B;
                System.out.print("the diff between " + A+" - " + B+" is " + C+"");
                break;
            case (3):
                C = A * B;
                System.out.print("the Multiply is " + A+" * " + B+" is " + C+"");
                break;
            case (4):
                C = A / B;
                System.out.print("the divison of " + A+" / " + B+" is " + C+"");
                break;
            default:
                System.out.print("No choice found ,try between 1 to 4");
                break;
        }



    }
}
