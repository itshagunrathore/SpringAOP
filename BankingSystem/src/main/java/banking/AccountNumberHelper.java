package banking;

public class AccountNumberHelper {
    private static long accountNumber = 0;

    private static int id = 1;

    public static long getAccountNumber() {
        return accountNumber;
    }

    public static long generateAccountNumber() {
        accountNumber = accountNumber + 1;
        return accountNumber;
    }


    public static void setAccountNumber(long accountNumber) {
        AccountNumberHelper.accountNumber = accountNumber;
    }


}
