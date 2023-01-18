import java.util.Scanner;
import java.time.Year;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;


    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;

    }

    public int getAge(){
        Year currentYear = Year.now();
         return (currentYear.getValue() - birthYear);
    }
    Scanner sc = new Scanner(System.in);

    public void input() {

        System.out.println("Enter First Name: ");
        this.setFirstName(sc.nextLine());

        System.out.println("Enter Last Name: ");
        this.setLastName(sc.nextLine());

        System.out.println("Enter Birth Year: ");
        this.setBirthYear(sc.nextInt());

    }

    public void output() {
        System.out.printf("%s %s born in %d ", this.getFirstName(), this.getLastName(), this.getBirthYear());
    }

    public void changeName(String fn, String ln) {
        this.setFirstName(fn);
        this.setLastName(ln);
    }
    }





