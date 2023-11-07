package entities;

public class ExpensesCategory {
    private String name;

    public ExpensesCategory() {
    }

    public ExpensesCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExpensesCategory{" +
                "name='" + name + '\'' +
                '}';
    }
}
