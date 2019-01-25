package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.ChildrenTariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.ComfortTariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.SmartTariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.Tariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.TariffBaseIsEmptyException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortingByParameterTest {

    @Test
    public void testAscSortByCost1() {
        Tariff[] tariffs = {new ComfortTariff(15.69, 3000, 1.5),
                new ChildrenTariff(10.0, 200, 10),
                new SmartTariff(19.2, 120, 5, 300)};

        try {
            assertEquals(new String[][]{{"CHILDREN", "10.0"}, {"COMFORT", "15.69"}, {"SMART", "19.2"}},
                    SortingByParameter.AscSortByCost(tariffs));
        } catch (TariffBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAscSortByCost2() {
        Tariff[] tariffs = {};

        try {
            SortingByParameter.AscSortByCost(tariffs);
        } catch (TariffBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAscSortByCost3() {
        Tariff[] tariffs = {new SmartTariff(5.5, 99, 5, 30)};

        try {
            assertEquals(new String[][]{{"SMART", "5.5"}}, SortingByParameter.AscSortByCost(tariffs));
        } catch (TariffBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }
}