package expenses;

public class Expense {
    private String name;
    private float amount;
    private int date;
    private String category;

    public Expense(String name, float amount, int date, String category) {
        this.name = name;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }git add

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

