package by.epam.javatraining.veranikayarashevich.tasks.maintask02.utils;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.*;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.NotDefinedTariffException;

public class Builder {

    public static Tariff buildTariff(TypeTariff typeTariff, double costOfTariff, int packageOfMinutes,
                                     int packageOfMinutesInOtherCountry, int packageOfGigabytes, int packageOSMS)
            throws NotDefinedTariffException {
        Tariff tariff;

        switch (typeTariff) {
            case BUSINESS:
                tariff = new BusinessTariff(costOfTariff, packageOfMinutes, packageOfMinutesInOtherCountry,
                        packageOfGigabytes, packageOSMS);
                break;
            case CHILDREN:
                tariff = new ChildrenTariff(costOfTariff, packageOfMinutes, packageOSMS);
                break;
            case COMFORT:
                tariff = new ComfortTariff(costOfTariff, packageOfMinutes, packageOfGigabytes);
                break;
            case SMART:
                tariff = new SmartTariff(costOfTariff, packageOfMinutes, packageOfGigabytes, packageOSMS);
                break;
            default:
                throw new NotDefinedTariffException();
        }

        return tariff;
    }

    public static Client buildClient(int phoneNumber, String name, TypeTariff typeTariff) {
        return new Client(phoneNumber, name, typeTariff);
    }

    public static String[][] buildClientBase(Client... clients) {
        for (Client c : clients) {
            ClientBase.setClient(c);
        }

        return ClientBase.getBase();
    }
}
