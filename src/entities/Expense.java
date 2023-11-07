package entities;

public class Expense {

    private Integer id;
    private String name;
    private Double amount;
    private String date;
    private ExpensesCategory category;

    public Expense() {
    }

    public Expense(Integer id, String name, Double amount, String date, ExpensesCategory category) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ExpensesCategory getCategory() {
        return category;
    }

    public void setCategory(ExpensesCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", category=" + category +
                '}';
    }
}