import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=1000;
        int choice;
        do {
            System.out.println("\n--- BANK ACCOUNT ---");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Current Balance:Rs."+balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount:Rs.");
                    double deposit=sc.nextDouble();

                    if (deposit>0) {
                        balance+=deposit;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Enter a valid amount");
                    }
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount:Rs. ");
                    double withdraw=sc.nextDouble();
                    if (withdraw>0 && withdraw<=balance) {
                        balance-=withdraw;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Invalid amount or insufficient balance");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our bank!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}

    
