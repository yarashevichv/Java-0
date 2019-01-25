package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.Tariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.TypeTariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.NotDefinedTariffException;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.TariffBaseIsEmptyException;

public class SearchTariff {

    public static String searchByOptions(boolean hasPackageOfMinutesInOtherCountry, boolean hasPackageOfGigabytes,
                                         boolean hasPackageOfSMS) throws NotDefinedTariffException {
        String result;

        if (hasPackageOfMinutesInOtherCountry && hasPackageOfGigabytes && hasPackageOfSMS) {
            result = TypeTariff.BUSINESS.name();
        } else if (hasPackageOfGigabytes && hasPackageOfSMS) {
            result = TypeTariff.SMART.name();
        } else if (hasPackageOfSMS) {
            result = TypeTariff.CHILDREN.name();
        } else if (hasPackageOfGigabytes) {
            result = TypeTariff.COMFORT.name();
        } else {
            throw new NotDefinedTariffException();
        }

        return result;
    }

    public static String searchMostExpensive(Tariff[] tariffs) throws TariffBaseIsEmptyException {

        Tariff[] array = tariffs;

        if (array.length == 0) {
            throw new TariffBaseIsEmptyException();
        } else {
            double max = array[0].getCostOfTariff();
            String result = array[0].getTypeOfTariff();

            for (int i = 1; i < array.length; i++) {
                if (max < array[i].getCostOfTariff()) {
                    result = array[i].getTypeOfTariff();
                }
            }

            return result;
        }
    }
}
