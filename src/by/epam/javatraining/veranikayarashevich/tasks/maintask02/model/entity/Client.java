package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity;

public class Client {

    private String phoneNumber;
    private String name;
    private TypeTariff typeTariff;

    public Client(String phoneNumber, String name, TypeTariff typeTariff) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.typeTariff = typeTariff;
    }

    public String getPhoneNumber() {
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
