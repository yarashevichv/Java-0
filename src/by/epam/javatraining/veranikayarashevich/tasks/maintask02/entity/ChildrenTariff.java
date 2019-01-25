package by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity;

import java.util.Objects;

public class ChildrenTariff extends Tariff {

    private int packageOfSMS;

    public ChildrenTariff(double costOfTariff, int packageOfMinutes, int packageOfSMS) {
        super(TypeTariff.CHILDREN, costOfTariff, packageOfMinutes);
        this.packageOfSMS = packageOfSMS;
    }

    public ChildrenTariff() {
        super();
        this.packageOfSMS = 0;
        this.setType(TypeTariff.CHILDREN);
    }

    public int getPackageOfSMS() {
        return packageOfSMS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChildrenTariff)) return false;
        ChildrenTariff that = (ChildrenTariff) o;
        return getPackageOfSMS() == that.getPackageOfSMS() &&
                getCostOfTariff() == that.getCostOfTariff() &&
                getPackageOfMinutes() == that.getPackageOfMinutes();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPackageOfSMS());
    }

    @Override
    public String toString() {
        return "ChildrenTariff{" +
                "costOfTariff=" + getCostOfTariff() +
                "packageOfMinutes=" + getPackageOfMinutes() +
                "packageOfSMS=" + packageOfSMS +
                '}';
    }
}
