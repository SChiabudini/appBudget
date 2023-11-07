package entities;

public class IncomesCategory {
    private String name;

    public IncomesCategory() {
    }
    public IncomesCategory(String name) {
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
        return "IncomesCategory{" +
                "name='" + name + '\'' +
                '}';
    }
}