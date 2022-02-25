package banking;

import java.util.List;

/**
 * Account implementation for commercial (business) customers.<br><br>
 * <p>
 * Private Variables:<br>
 * {@link #authorizedUsers}: List&lt;Person&gt;<br>
 */
public class CommercialAccount extends Account {
    private List<Person> authorizedUsers;
    private Company company;
    private Long accountNumber;
    private int pin;
    private double startingDeposit;

    public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
        super(new AccountHolder(company.getTaxID()), accountNumber, pin, startingDeposit);
        this.company = company;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.startingDeposit = startingDeposit;
    }

//    public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
//        // complete the function
//    }

    /**
     * @param person The authorized user to add to the account.
     */
    protected void addAuthorizedUser(Person person) {
        authorizedUsers.add(person);
    }

    /**
     * @param person
     * @return true if person matches an authorized user in {@link #authorizedUsers}; otherwise, false.
     */
    public boolean isAuthorizedUser(Person person) {
        return authorizedUsers.contains(person);
    }

    public int getPin() {
        return pin;
    }
}
