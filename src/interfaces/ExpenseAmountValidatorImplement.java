package interfaces;

import exceptions.InvalidExpenseException;
import interfaces.ExpenseAmountValidator;

public class ExpenseAmountValidatorImplement implements ExpenseAmountValidator {
    @Override
    public boolean notValidAmount(double amount) throws InvalidExpenseException {
        if (amount < 0){
            throw new InvalidExpenseException("El monton debe ser igual o mayor a 0.");
        }
        return false;
    }
}
