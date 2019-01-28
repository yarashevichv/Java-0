package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity;

import java.util.Objects;

public class ChildrenTariff extends Tariff {

    private int packageOfSMS = 0;

    public ChildrenTariff(double costOfTariff, int packageOfMinutes, int packageOfSMS) {
        super(TypeTariff.CHILDREN, costOfTariff, packageOfMinutes);
        this.packageOfSMS = packageOfSMS;
    }

    public ChildrenTariff() {
        this.setType(TypeTariff.CHILDREN);
    }

    public void setPackageOfSMS(int packageOfSMS) {
        this.packageOfSMS = packageOfSMS;
    }

    public int getPackageOfSMS() {
        return packageOfSMS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChildrenTariff)) return false;
        if (!super.equals(o)) return false;
        ChildrenTariff that = (ChildrenTariff) o;
        return getPackageOfSMS() == that.getPackageOfSMS();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPackageOfSMS());
    }

    @Override
    public String toString() {
        return "ChildrenTariff{" +
                "packageOfSMS=" + packageOfSMS +
                '}';
    }
}
