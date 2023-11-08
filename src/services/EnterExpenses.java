package services;

import entities.Expense;
import entities.ExpensesCategory;

import java.util.Scanner;

public class EnterExpenses {

    public EnterExpenses() {
    }

    public static void addExpenses(){
        int counter = 1;
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

            scanner.nextLine();
            System.out.println("Ingrese el nombre del gasto:");
            String name = scanner.nextLine();

            System.out.println("Ingrese el monto del gasto:");
            Double amount = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Ingrese la categoría del gasto:");
            String categoryName = scanner.nextLine().toLowerCase().trim();
            category.setName(categoryName);

            System.out.println("Ingrese la fecha del gasto: (dd/mm/yyyy)");
            String date = scanner.nextLine();

            expense.setId(counter);
            expense.setName(name);
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
