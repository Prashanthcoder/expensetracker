import java.util.ArrayList;

public class ExpenseTracker {
    ArrayList<Expense> expenses = new ArrayList<>();
    void addExpense(String title, double amount){
        Expense expense = new Expense(title, amount);
        expenses.add(expense);
        System.out.println("The new expense added.");
    }

    void showExpense(){
        if (expenses.isEmpty()){
            System.out.println("The expenses is not yet added!");
        }
        for(Expense e: expenses){
            System.out.println(e.title + ":$" + e.amount);
        }
    }

    void showtotal(){
        double total = 0.0;
        for (Expense e: expenses){
            total = total + e.amount;
        }
        System.out.println("The total amount is : "+ total);
    }
}
