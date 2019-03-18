package WaitTime;

public class Customer {
    private String name;
    private int transactions;

    /**
     * Creates a customer with the given name and
     * number of transactions to be completed
     * @param name the name of the customer
     * @param transactions the number of transactions to be made
     */
    public Customer(String name, int transactions){
        this.name = name;
        this.transactions = transactions;
    }

    /**
     * Returns the number of transactions remaining
     * @return the number of transactions remaining
     */
    public int getTransactions(){
        return transactions;
    }

    /**
     * Gets the name of the customer
     * @return the name of the customer
     */
    public String getName(){
        return name;
    }

    /**
     * Completes one transaction and reduces the number
     * of transactions by one
     * @return true if a transaction completed successfully,
     * false if there are no more transactions.
     */
    public boolean completeOneTransaction(){
        if(transactions == 0){
            return false;
        }
        transactions--;
        return true;
    }

    /**
     * Returns the name and number of transactions remaining
     */
    public String toString(){
        return (getName() + " has " + getTransactions() + " transaction(s).");
    }

}
