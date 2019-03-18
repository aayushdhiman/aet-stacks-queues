package WaitTime;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WaitTime {

    /**
     * Fills the registers with the people in line
     *
     * @param registers the registers to fill with
     * @param line      the line that people are in
     */
    public static void fillRegisters(Customer[] registers, Queue<Customer> line) {
        //TODO: assign customers to array of registers
        for (int i = 0; i < registers.length; i++) {
            if (registers[i] == null || registers[i].getTransactions() == 0) {
                if (line.size() > 0) {
                    registers[i] = line.remove();
                } else {
                    registers[i] = null;
                }
            }
        }
    }

    /**
     * Checks if the registers are full.
     *
     * @param registers the registers to check for emptiness
     * @return true if full, false if not
     */
    public static boolean isRegistersFull(Customer[] registers, Queue<Customer> line) {
        fillRegisters(registers, line);
        for (int i = 0; i < registers.length; i++) {
            if (registers[i] == null || registers[i].getTransactions() == 0) {
                registers[i] = null;
                return false;
            }
        }
        return true;
    }

    /**
     * Calculates the amount of time one has to wait to buy stuff
     * @param registers the registers open at the time
     * @param line the line of people waiting
     * @return the amount of time one must wait
     */
    public static int calculateWaitTime(Customer[] registers, Queue<Customer> line) {
        int time = 0;

        while (isRegistersFull(registers, line)) {
            fillRegisters(registers, line);
            for (int i = 0; i < registers.length; i++) {
                if (registers[i].getTransactions() > 0) {
                    time++;
                    for (int j = 0; j < registers.length; j++) {
                        registers[j].completeOneTransaction();
                        System.out.println(registers[j]);
                    }
                    System.out.println("Time: " + time);
                } else {
                    System.out.println("Break, " + registers[i]);
                    break;
                }
            }

        }

        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many registers? ");
        int regis = sc.nextInt();
        Customer[] registers = new Customer[regis];

        Queue<Customer> line = new LinkedList<Customer>();

        line.add(new Customer("Steve", 3));
        line.add(new Customer("Bucky", 2));
        line.add(new Customer("Sam", 4));
        line.add(new Customer("Tony", 1));
        line.add(new Customer("Natasha", 3));
//        line.add(new Customer("Bruce", 5));
//        line.add(new Customer("Wanda", 2));
//        line.add(new Customer("Thor", 1));
//        line.add(new Customer("Peter", 3));

        int time = calculateWaitTime(registers, line);

        System.out.println("Your wait time is " + time + " minutes.");

    }

}
