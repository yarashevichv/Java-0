package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.ChildrenTariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.ComfortTariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.SmartTariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.Tariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.NotDefinedTariffException;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.TariffBaseIsEmptyException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchTariffTest {

    @Test
    public void searchByOptions1() {
        try {
            assertEquals("SMART", SearchTariff.searchByOptions(false,
                    true, true));
        } catch (NotDefinedTariffException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void searchByOptions2() {
        try {
            assertEquals("BUSINESS", SearchTariff.searchByOptions(true,
                    true, true));
        } catch (NotDefinedTariffException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void searchByOptions3() {
        try {
            SearchTariff.searchByOptions(false, false,
                    false);
        } catch (NotDefinedTariffException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void searchMostExpensive1() {
        Tariff[] tariffs = {new SmartTariff(),
                new ChildrenTariff(10.0, 200, 10)};

        try {
            assertEquals("SMART", SearchTariff.searchMostCheap(tariffs));
        } catch (TariffBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void searchMostExpensive2() {
        try {
        SearchTariff.searchMostCheap(new Tariff[]{});
        } catch (TariffBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void searchMostExpensive3() {
        Tariff[] tariffs = {new ComfortTariff(15.69, 3000, 1.5),
                new ChildrenTariff(10.0, 200, 10),
                new SmartTariff(19.2, 120, 5, 300)};

        try {
            assertEquals("CHILDREN", SearchTariff.searchMostCheap(tariffs));
        } catch (TariffBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }
}
