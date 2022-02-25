package banking;

public class Person {
    private String firstName;
    private String lastName;
    private int idNum;

    public Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNumber
        ;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return idNum;
    }
}
