package by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity;

import java.util.Objects;

public class SmartTariff extends Tariff {

    private double packageOfGigabytes;
    private int packageOfSMS;

    public SmartTariff(double costOfTariff, int packageOfMinutes, double packageOfGigabytes, int packageOfSMS) {
        super(TypeTariff.SMART, costOfTariff, packageOfMinutes);
        this.packageOfGigabytes = packageOfGigabytes;
        this.packageOfSMS = packageOfSMS;
    }

    public SmartTariff() {
        super();
        this.packageOfGigabytes = 0;
        this.packageOfSMS = 0;
        this.setType(TypeTariff.SMART);
    }

    public double getPackageOfGigabytes() {
        return packageOfGigabytes;
    }

    public int getPackageOfSMS() {
        return packageOfSMS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartTariff)) return false;
        SmartTariff that = (SmartTariff) o;
        return Double.compare(that.getPackageOfGigabytes(), getPackageOfGigabytes()) == 0 &&
                getPackageOfSMS() == that.getPackageOfSMS() &&
                getCostOfTariff() == that.getCostOfTariff() &&
                getPackageOfMinutes() == that.getPackageOfMinutes();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPackageOfGigabytes(), getPackageOfSMS());
    }

    @Override
    public String toString() {
        return "SmartTariff{" +
                "costOfTariff=" + getCostOfTariff() +
                "packageOfMinutes=" + getPackageOfMinutes() +
                "packageOfGigabytes=" + packageOfGigabytes +
                ", packageOfSMS=" + packageOfSMS +
                '}';
    }
}
