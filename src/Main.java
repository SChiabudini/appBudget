import exceptions.InvalidExpenseException;
import services.EnterExpenses;

public class Main {
    public static void main(String[] args) throws InvalidExpenseException {
        EnterExpenses.addExpenses();
    }
}