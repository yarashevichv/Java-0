package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity;

import java.util.Objects;

public class BusinessTariff extends Tariff {

    private int packageOfMinutesInOtherCountry = 0;
    private double packageOfGigabytes = 0;
    private int packageOfSMS = 0;

    public BusinessTariff(double costOfTariff, int packageOfMinutes, int packageOfMinutesInOtherCountry,
                          double packageOfGigabytes, int packageOfSMS) {
        super(TypeTariff.BUSINESS, costOfTariff, packageOfMinutes);
        this.packageOfMinutesInOtherCountry = packageOfMinutesInOtherCountry;
        this.packageOfGigabytes = packageOfGigabytes;
        this.packageOfSMS = packageOfSMS;
    }

    public void setPackageOfMinutesInOtherCountry(int packageOfMinutesInOtherCountry) {
        this.packageOfMinutesInOtherCountry = packageOfMinutesInOtherCountry;
    }

    public void setPackageOfGigabytes(double packageOfGigabytes) {
        this.packageOfGigabytes = packageOfGigabytes;
    }

    public void setPackageOfSMS(int packageOfSMS) {
        this.packageOfSMS = packageOfSMS;
    }

    public BusinessTariff() {
        this.setType(TypeTariff.BUSINESS);
    }

    public int getPackageOfMinutesInOtherCountry() {
        return packageOfMinutesInOtherCountry;
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
        if (!(o instanceof BusinessTariff)) return false;
        if (!super.equals(o)) return false;
        BusinessTariff that = (BusinessTariff) o;
        return getPackageOfMinutesInOtherCountry() == that.getPackageOfMinutesInOtherCountry() &&
                Double.compare(that.getPackageOfGigabytes(), getPackageOfGigabytes()) == 0 &&
                getPackageOfSMS() == that.getPackageOfSMS();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPackageOfMinutesInOtherCountry(), getPackageOfGigabytes(),
                getPackageOfSMS());
    }

    @Override
    public String toString() {
        return "BusinessTariff{" +
                "costOfTariff=" + getCostOfTariff() +
                "packageOfMinutes=" + getPackageOfMinutes() +
                "packageOfMinutesInOtherCountry=" + packageOfMinutesInOtherCountry +
                ", packageOfGigabytes=" + packageOfGigabytes +
                ", packageOfSMS=" + packageOfSMS +
                '}';
    }
}
