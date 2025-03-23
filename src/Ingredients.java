public class Ingredients {

    double amount;
    String unit;
    String name;

    public Ingredients(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }
    public Ingredients() {
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }
    //roomboter, suiker bakmeel ei vanillesuiker zout zoetzure appels kristal suiker kaneel paneermeel
}
