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

    @Override
    public double tax() {
        double basicTax;
        if (getAnuallncome() < 20000.0){
            basicTax = getAnuallncome() * 0.15;
        }
        else {
            basicTax = getAnuallncome() *0.25;
        }
        basicTax -= getHealthExpenditures() * 0.5;
        if (basicTax < 0.0){
            basicTax = 0.0;
        }
        return basicTax;
    }
}
