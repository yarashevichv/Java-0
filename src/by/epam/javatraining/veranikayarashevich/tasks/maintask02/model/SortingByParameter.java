package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.Tariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.TariffDatabase;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.TariffBaseIsEmptyException;

import java.util.ArrayList;
import java.util.List;

public class SortingByParameter {

    public static List<Tariff> AscSortByCost(TariffDatabase database) throws TariffBaseIsEmptyException {
        List<Tariff> array = database.getDatabase();

        if (array.size() == 0) {
            throw new TariffBaseIsEmptyException();
        } else {
            if (array.size() > 1) {
                for (int i = 1; i < array.size(); i++) {
                    if (array.get(i - 1).getCostOfTariff() > array.get(i).getCostOfTariff()) {
                        Tariff temp = array.get(i - 1);
                        array.set(i - 1, array.get(i));
                        array.set(i, temp);
                    }
                }
            }

            return array;
        }
    }

    public static List<Tariff> AscSortByPackageOfMinutes(TariffDatabase database) throws TariffBaseIsEmptyException {
        List<Tariff> array = database.getDatabase();

        if (array.size() == 0) {
            throw new TariffBaseIsEmptyException();
        } else {
            if (array.size() > 1) {
                for (int i = 1; i < array.size(); i++) {
                    if (array.get(i - 1).getPackageOfMinutes() > array.get(i).getPackageOfMinutes()) {
                        Tariff temp = array.get(i - 1);
                        array.set(i - 1, array.get(i));
                        array.set(i, temp);
                    }
                }
            }

            return array;
        }
    }
}
