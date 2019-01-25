package by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity;

import java.util.Objects;

public class BusinessTariff extends Tariff {

    private int packageOfMinutesInOtherCountry;
    private double packageOfGigabytes;
    private int packageOfSMS;

    public BusinessTariff(double costOfTariff, int packageOfMinutes, int packageOfMinutesInOtherCountry,
                          double packageOfGigabytes, int packageOfSMS) {
        super(TypeTariff.BUSINESS, costOfTariff, packageOfMinutes);
        this.packageOfMinutesInOtherCountry = packageOfMinutesInOtherCountry;
        this.packageOfGigabytes = packageOfGigabytes;
        this.packageOfSMS = packageOfSMS;
    }

    public BusinessTariff() {
        super();
        this.packageOfMinutesInOtherCountry = 0;
        this.packageOfGigabytes = 0;
        this.packageOfSMS = 0;
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
        BusinessTariff that = (BusinessTariff) o;
        return getPackageOfMinutesInOtherCountry() == that.getPackageOfMinutesInOtherCountry() &&
                Double.compare(that.getPackageOfGigabytes(), getPackageOfGigabytes()) == 0 &&
                getPackageOfSMS() == that.getPackageOfSMS() &&
                getCostOfTariff() == that.getCostOfTariff() &&
                getPackageOfMinutes() == that.getPackageOfMinutes();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPackageOfMinutesInOtherCountry(), getPackageOfGigabytes(), getPackageOfSMS());
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
