package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity;

import java.util.Objects;

public class SmartTariff extends Tariff {

    private double packageOfGigabytes = 0;
    private int packageOfSMS = 0;

    public SmartTariff(double costOfTariff, int packageOfMinutes, double packageOfGigabytes, int packageOfSMS) {
        super(TypeTariff.SMART, costOfTariff, packageOfMinutes);
        this.packageOfGigabytes = packageOfGigabytes;
        this.packageOfSMS = packageOfSMS;
    }

    public SmartTariff() {
        this.setType(TypeTariff.SMART);
    }

    public void setPackageOfGigabytes(double packageOfGigabytes) {
        this.packageOfGigabytes = packageOfGigabytes;
    }

    public void setPackageOfSMS(int packageOfSMS) {
        this.packageOfSMS = packageOfSMS;
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
        if (!super.equals(o)) return false;
        SmartTariff that = (SmartTariff) o;
        return Double.compare(that.getPackageOfGigabytes(), getPackageOfGigabytes()) == 0 &&
                getPackageOfSMS() == that.getPackageOfSMS();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPackageOfGigabytes(), getPackageOfSMS());
    }

    @Override
    public String toString() {
        return "SmartTariff{" +
                "packageOfGigabytes=" + packageOfGigabytes +
                ", packageOfSMS=" + packageOfSMS +
                '}';
    }

}
