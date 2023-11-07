import entities.Expense;
import entities.ExpensesCategory;

import java.util.Scanner;

public class Main {

    public static int counter = 1;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isWrongType = false;

        int index = 0;
        int incomeItemsAmount = 0;

        do{
            System.out.println("Ingrese la cantidad de gastos a registrar");
            if(scanner.hasNextInt()){
                incomeItemsAmount = scanner.nextInt();
            } else{
                System.out.println("Tipo de dato erróneo");
            }
        } while(isWrongType);

        Expense[] expenses = new Expense[incomeItemsAmount];

        do{
            Expense expense = new Expense();
            ExpensesCategory category = new ExpensesCategory();

            System.out.println("Ingrese el monto del gasto:");
            Double amount = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Ingrese la categoría del gasto:");
            String categoryName = scanner.nextLine().toLowerCase().trim();
            category.setName(categoryName);

            System.out.println("Ingrese la fecha del gasto: (dd/MM/yyyy)");
            String date = scanner.nextLine();

            expense.setId(counter);
            expense.setAmount(amount);
            expense.setCategory(category);
            expense.setDate(date);

            expenses[index] = expense;

            counter++;
            index++;
        } while(index < incomeItemsAmount);

        System.out.println("Detalle de gastos ingresados:");
        for(int i = 0; i < expenses.length; i++){
            System.out.println(expenses[i]);
        };

    }
}