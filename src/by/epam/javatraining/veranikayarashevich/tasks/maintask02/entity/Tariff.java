package by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity;

public class Tariff {

    private TypeTariff type;

    public int i = 3;

    private double costOfTariff;
    private int packageOfMinutes;

    public Tariff(TypeTariff type, double costOfTariff, int packageOfMinutes) {
        this.type = type;
        this.costOfTariff = costOfTariff;
        this.packageOfMinutes = packageOfMinutes;
    }

    public Tariff() {
        costOfTariff = 0;
        packageOfMinutes = 0;
    }

    public double getCostOfTariff() {
        return costOfTariff;
    }

    public int getPackageOfMinutes() {
        return packageOfMinutes;
    }

    public void setCostOfTariff(double costOfTariff) {
        this.costOfTariff = costOfTariff;
    }

    public void setPackageOfMinutes(int packageOfMinutes) {
        this.packageOfMinutes = packageOfMinutes;
    }

    public void setType(TypeTariff type) {
        this.type = type;
    }

    public String getTypeOfTariff() {
        return type.name();
    }
}
