package javacore;

public class HomeWorkTask3 {
    public static void main(String[] args) {

        double c1, c2, c3;
        double t1, t2, t3;
        c1 = 0.5;
        c2 = 0.35;
        c3 = 0.7;
        t1 = 15.26;
        t2 = 90.01;
        t3 = 31.00;
        System.out.println("Cost of the phone-call to country 1 " + (c1*t1));
        System.out.println("Cost of the phone-call to country 2 " + (c2*t2));
        System.out.println("Cost of the phone-call to country 3 " + (c3*t3));
        System.out.println("TOTAL " + ((c1*t1) + (c2*t2) + (c3*t3)));
    }
}
