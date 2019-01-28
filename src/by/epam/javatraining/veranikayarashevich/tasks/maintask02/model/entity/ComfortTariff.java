package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity;

import java.util.Objects;

public class ComfortTariff extends Tariff {

    private double packageOfGigabytes = 0;

    public ComfortTariff(double costOfTariff, int packageOfMinutes, double packageOfGigabytes) {
        super(TypeTariff.COMFORT, costOfTariff, packageOfMinutes);
        this.packageOfGigabytes = packageOfGigabytes;
    }

    public ComfortTariff() {
        this.setType(TypeTariff.COMFORT);
    }

    public void setPackageOfGigabytes(double packageOfGigabytes) {
        this.packageOfGigabytes = packageOfGigabytes;
    }

    public double getPackageOfGigabytes() {
        return packageOfGigabytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComfortTariff)) return false;
        if (!super.equals(o)) return false;
        ComfortTariff that = (ComfortTariff) o;
        return Double.compare(that.getPackageOfGigabytes(), getPackageOfGigabytes()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPackageOfGigabytes());
    }

    @Override
    public String toString() {
        return "ComfortTariff{" +
                "packageOfGigabytes=" + packageOfGigabytes +
                '}';
    }
}
