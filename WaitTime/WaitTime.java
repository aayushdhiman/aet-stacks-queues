package WaitTime;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WaitTime {
    private static Queue<Customer> line = new LinkedList<Customer>();

    public static int calculateWaitTime(Customer[] registers){
        int time = 0;
        for (int i = 0; i < registers.length; i++) {
            
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many registers? ");
        int regis = sc.nextInt();
        Customer[] registers = new Customer[regis];

        line.add(new Customer("Steve", 3));
        line.add(new Customer("Bucky", 2));
        line.add(new Customer("Sam", 4));
        line.add(new Customer("Tony", 1));
        line.add(new Customer("Natasha", 3));

        int time = calculateWaitTime(registers);
        System.out.println("Your wait time is " + time + " minutes.");

    }

}
