package by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity;

public class Client {

    private int phoneNumber;
    private String name;
    private TypeTariff typeTariff;

    public Client(int phoneNumber, String name, TypeTariff typeTariff) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.typeTariff = typeTariff;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public TypeTariff getTypeTariff() {
        return typeTariff;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name=" + name +
                ", number=" + phoneNumber +
                ", tariff=" + typeTariff +
                '}';
    }
}
