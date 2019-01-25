package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.ChildrenTariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.ComfortTariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.SmartTariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.Tariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.TariffBaseIsEmptyException;

public class SortingByParameter {

    public static final int SIZE_OF_COLUMNS = 2;

    public static String[][] AscSortByCost(Tariff[] tariffs) throws TariffBaseIsEmptyException {
        Tariff[] array = tariffs;

        if (array.length == 0) {
            throw new TariffBaseIsEmptyException();
        } else {
            String[][] result = new String[array.length][SIZE_OF_COLUMNS];

            for (int i = 0; i < result.length; i++) {
                result[i][0] = array[i].getTypeOfTariff();
            }

            if (array.length > 1) {
                for (int i = 0; i < result.length; i++) {
                    for (int j = 1; j < result[i].length; j++) {
                        if (array[j - 1].getCostOfTariff() > array[j].getCostOfTariff()) {
                            double temp = array[j - 1].getCostOfTariff();
                            array[j - 1].setCostOfTariff(array[j].getCostOfTariff());
                            array[j].setCostOfTariff(temp);

                            String s = result[j - 1][0];
                            result[j - 1][0] = result[j][0];
                            result[j][0] = s;
                        }
                    }
                }
            }

            for (int i = 0; i < result.length; i++) {
                result[i][1] = String.valueOf(array[i].getCostOfTariff());
            }

            return result;
        }
    }
}
