package interfaces;

import exceptions.InvalidExpenseException;

public interface ExpenseAmountValidator {
    boolean notValidAmount(double amount) throws InvalidExpenseException;
}
