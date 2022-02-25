package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
    private LinkedHashMap<Long, Account> accounts = new LinkedHashMap<>();

    public Bank() {
        // complete the function
    }

    private Account getAccount(Long accountNumber) {
        // complete the function
        return accounts.get(accountNumber);
    }

    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
        long accountNumber = AccountNumberHelper.generateAccountNumber();
        Account consumerAccount = new CommercialAccount(company, accountNumber, pin, startingDeposit);

        accounts.put(accountNumber, consumerAccount);
        return accountNumber;

    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        long accountNumber = AccountNumberHelper.generateAccountNumber();
        Account consumerAccount = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
        accounts.put(accountNumber, consumerAccount);
        return accountNumber;
    }

    public boolean authenticateUser(Long accountNumber, int pin) {
        return accounts.get(accountNumber).validatePin(pin);

    }

    public double getBalance(Long accountNumber) {
        return accounts.get(accountNumber).getBalance();
    }

    public void credit(Long accountNumber, double amount) {
        // complete the function
        accounts.get(accountNumber).creditAccount(amount);
    }

    public boolean debit(Long accountNumber, double amount) {
        // complete the function
        return accounts.get(accountNumber).debitAccount(amount);
    }
}
