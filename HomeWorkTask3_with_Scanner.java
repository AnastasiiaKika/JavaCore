package javacore;
import java.util.Scanner;

public class HomeWorkTask3_with_Scanner {
    public static void main(String[] args) {
        double c1, c2, c3;
        double t1, t2, t3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input standard units per minute for Ukraine ");
        c1= sc.nextDouble();
        System.out.println("Input minutes minutes in a conversation ");
        t1= sc.nextDouble();
        System.out.println("Cost " + (c1*t1));
        System.out.println("Input standard units per minute for Belgium ");
        c2= sc.nextDouble();
        System.out.println("Input minutes minutes in a conversation ");
        t2= sc.nextDouble();
        System.out.println("Cost " + (c2*t2));
        System.out.println("Input standard units per minute for Finland ");
        c3= sc.nextDouble();
        System.out.println("Input minutes minutes in a conversation ");
        t3= sc.nextDouble();
        System.out.println("Cost " + (c3*t3));
        System.out.println("Total " + ((c1*t1) + (c2*t2) + (c3*t3)));




    }
}
