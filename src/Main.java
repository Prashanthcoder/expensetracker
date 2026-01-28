import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseTracker exp = new ExpenseTracker();
        while (true) {
            System.out.println("Enter the choice user choose between these only");
            System.out.println("1. Add expense\n");
            System.out.println("2. view expenses\n");
            System.out.println("3. show total \n");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1: System.out.println("Enter the expense  title and its expense you wann add");
                        String title = sc.nextLine();
                        double amount = sc.nextDouble();
                        exp.addExpense(title, amount);
                        break;
                case 2: System.out.println("Expenses history: ------------------");
                        exp.showExpense();
                        break;
                case 3: System.out.println("Total expenditure is: ");
                        exp.showtotal();
                        break;
                case 4: System.out.println("Goodbye to the end!");
                        System.exit(0);

                default : System.out.println("please choose or enter the option between 1 and 4");
            }
        }
    }

}
