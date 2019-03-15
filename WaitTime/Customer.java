package WaitTime;

public class Customer {
    private String name;
    private int transations;

    /**
     * Creates a customer with the given name and
     * number of transactions to be completed
     * @param name the name of the customer
     * @param transactions the number of transactions to be made
     */
    public Customer(String name, int transactions){
        this.name = name;
        this.transations = transactions;
    }

    /**
     * Returns the number of transactions remaining
     * @return the number of transactions remaining
     */
    public int getTransactions(){
        return transations;
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
        if(transations > 0){
            return false;
        }
        transations--;
        return true;
    }

    /**
     * Returns the name and number of transactions remaining
     */
    public String toString(){
        return (getName() + " completed " + transations + " transactions.");
    }

}
