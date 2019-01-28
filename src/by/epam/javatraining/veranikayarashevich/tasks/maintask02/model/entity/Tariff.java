package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity;

import java.util.Objects;

public class Tariff {

    private TypeTariff type = TypeTariff.DEFAULT;

    private double costOfTariff = 0;
    private int packageOfMinutes = 0;

    public Tariff() {
    }

    public Tariff(TypeTariff type, double costOfTariff, int packageOfMinutes) {
        this.type = type;
        this.costOfTariff = costOfTariff;
        this.packageOfMinutes = packageOfMinutes;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tariff)) return false;
        Tariff tariff = (Tariff) o;
        return Double.compare(tariff.getCostOfTariff(), getCostOfTariff()) == 0 &&
                getPackageOfMinutes() == tariff.getPackageOfMinutes() &&
                type == tariff.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, getCostOfTariff(), getPackageOfMinutes());
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "type=" + type +
                ", costOfTariff=" + costOfTariff +
                ", packageOfMinutes=" + packageOfMinutes +
                '}';
    }
}
