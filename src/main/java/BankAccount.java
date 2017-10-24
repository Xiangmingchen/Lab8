//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * Distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * checking account.
         */
        CHECKINGS,
        /**
         * saving account.
         */
        SAVINGS,
        /**
         * student account.
         */
        STUDENT,
        /**
         * work place account.
         */
        WORKPLACE
    }
    /**
     * The account number of this account.
     */
    private int accountNumber;
    /**
     * The account type of this account.
     */
    private BankAccountType accountType;
    /**
     * The account balance of this account.
     */
    private double accountBalance;
    /**
     * The owner's name of this account.
     */
    private String ownerName;
    /**
     * The interest rate of this account.
     */
    private double interestRate;
    /**
     * The interest earned for this account.
     */
    private double interestEarned;
    /**
     * Constructor that takes in the name of the owner and account type.
     * @param name owner's name
     * @param accountCategory the account type of this account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.increseNumberOfAccount();
    }
    /**
     * Getter for account balance.
     * @return the current balance of this account
     */
    public double getBalance() {
        return accountBalance;
    }
    /**
     * Setter for account balance.
     * @param newBalance the new balance for this account
     */
    public void setBalance(final double newBalance) {
        this.accountBalance = newBalance;
    }
    /**
     * Setter for owner's name.
     * @param name new name
     */
    public void setName(final String name) {
        this.ownerName = name;
    }

}
