package banking;

public class ConsumerAccount extends Account {
    private Person person;
    private Long accNum;
    private int pin;
    private double currBal;

    public ConsumerAccount(Person person, Long accNum, int pin, double currBal) {
        super(new AccountHolder(person.getID()), accNum, pin, currBal);
        this.person = person;
        this.accNum = accNum;
        this.pin = pin;
        this.currBal = currBal;
    }


}
