package by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity;

import java.util.Objects;

public class ComfortTariff extends Tariff {

    private double packageOfGigabytes;

    public ComfortTariff(double costOfTariff, int packageOfMinutes, double packageOfGigabytes) {
        super(TypeTariff.COMFORT, costOfTariff, packageOfMinutes);
        this.packageOfGigabytes = packageOfGigabytes;
    }

    public ComfortTariff() {
        super();
        this.packageOfGigabytes = 0;
        this.setType(TypeTariff.COMFORT);
    }

    public double getPackageOfGigabytes() {
        return packageOfGigabytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComfortTariff)) return false;
        ComfortTariff that = (ComfortTariff) o;
        return Double.compare(that.getPackageOfGigabytes(), getPackageOfGigabytes()) == 0 &&
                getCostOfTariff() == that.getCostOfTariff() &&
                getPackageOfMinutes() == that.getPackageOfMinutes();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPackageOfGigabytes());
    }

    @Override
    public String toString() {
        return "ComfortTariff{" +
                "costOfTariff=" + getCostOfTariff() +
                "packageOfMinutes=" + getPackageOfMinutes() +
                "packageOfGigabytes=" + packageOfGigabytes +
                '}';
    }
}
