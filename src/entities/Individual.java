package entities;

public class Individual extends TaxPayer{
    private double healthExpenditures;

    public Individual(String name, double anuallncome, double healthExpenditures) {
        super(name, anuallncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
