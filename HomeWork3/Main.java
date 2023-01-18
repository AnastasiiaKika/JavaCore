

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();


        System.out.println("Enter the information about Person p1 ");
        p1.input();
        System.out.println("Enter the information about Person p2 ");
        p2.input();
        System.out.println("Enter the information about Person p3 ");
        p3.input();
        System.out.println("Enter the information about Person p4 ");
        p4.input();
        System.out.println("Enter the information about Person p5 ");
        p5.input();


        System.out.println("Show information about persons ");
        p1.output();
        System.out.println(", age: " + p1.getAge());
        p2.output();
        System.out.println(", age: " + p2.getAge());
        p3.output();
        System.out.println(", age: " + p3.getAge());
        p4.output();
        System.out.println(", age: " + p4.getAge());
        p5.output();
        System.out.println(", age: " + p5.getAge());

    }

}
