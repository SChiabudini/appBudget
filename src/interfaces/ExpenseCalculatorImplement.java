package interfaces;

import entities.Expense;
import interfaces.ExpenseCalculator;

public class ExpenseCalculatorImplement implements ExpenseCalculator {
    @Override
    public double calculateExpense(Expense expense) {
        return expense.getAmount();
    }

    @Override
    public double calculateTotalExpense(Expense[] expenses) {
        double totalExpense = 0;

        for(Expense expense : expenses){
            totalExpense = totalExpense + expense.getAmount();
        }

        return  totalExpense;
    }
}
