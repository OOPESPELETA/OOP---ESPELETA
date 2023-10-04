
package runsavingsaccount;

import java.util.Scanner;

public class RunSavingsAccount {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();

       
        System.out.print("Enter the interest rate: ");
        double interestRate = sc.nextDouble();
        SavingsAccount.setInterestRate(interestRate);

       
        System.out.print("Enter the initial deposit amount: ");
        double initial = sc.nextDouble();
        savings.deposit(initial);
        
        SavingsAccount.showBalance(savings);

        boolean transac = true;

        while (transac) {
            System.out.print("Enter 'D' for deposit, 'W' for withdraw ");
            String choice = sc.next().toUpperCase();

            if (choice.equals("D")) {

                System.out.print("Enter the deposit amount: ");
                double depositamount = sc.nextDouble();
                savings.deposit(depositamount);
                

            } else if (choice.equals("W")) {

                System.out.print("Enter the withdrawal amount: ");
                double withdrawamount = sc.nextDouble();
                double withdrawn = savings.withdraw(withdrawamount);

                if (withdrawn > 0) {

                    System.out.println("Withdrawn: " + withdrawn + " Pesos");

                } else {

                    System.out.println("Insufficient balance for withdrawal.");
                    
                }

            } else {

                System.out.println("Invalid choice. Please enter 'D' or 'W'.");
                
            }

            SavingsAccount.showBalance(savings);

            if (savings.getBalance() > 1000) {
                savings.addInterest();
                System.out.println("New Balance with Interest: " + savings.getBalance() + " Pesos");
            }
        }

       
    }
}