package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.*;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.TariffBaseIsEmptyException;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class SortingByParameterTest {

    @Test
    public void testAscSortByCost1() {
        TariffDatabase database = new TariffDatabase();
        database.setTariff(new ComfortTariff(15.69, 3000, 1.5));
        database.setTariff(new ChildrenTariff(10.0, 200, 10));
        database.setTariff(new SmartTariff(19.2, 120, 5, 300));

        List<Tariff> result = new ArrayList<Tariff>();
        result.add(new ChildrenTariff(10.0, 200, 10));
        result.add(new ComfortTariff(15.69, 3000, 1.5));
        result.add(new SmartTariff(19.2, 120, 5, 300));

        try {
            assertEquals(result, SortingByParameter.AscSortByCost(database));
        } catch (TariffBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAscSortByCost2() {
        TariffDatabase database = new TariffDatabase();

        try {
            SortingByParameter.AscSortByCost(database);
        } catch (TariffBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAscSortByCost3() {
        TariffDatabase database = new TariffDatabase();
        database.setTariff(new SmartTariff(5.5, 99, 5, 30));

        List<Tariff> result = new ArrayList<Tariff>();
        result.add(new SmartTariff(5.5, 99, 5, 30));

        try {
            assertEquals(result, SortingByParameter.AscSortByCost(database));
        } catch (TariffBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }
}