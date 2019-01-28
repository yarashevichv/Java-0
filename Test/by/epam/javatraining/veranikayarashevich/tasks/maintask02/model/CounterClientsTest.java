package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.Client;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.ClientDatabase;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.TypeTariff;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.ClientDatabaseIsEmptyException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CounterClientsTest {

    @Test
    public void calculateCountClients1() {
        ClientDatabase database = new ClientDatabase();
        database.setClient(new Client("+375447638569", "Ann", TypeTariff.CHILDREN));
        database.setClient(new Client("80296554565", "John", TypeTariff.SMART));

        try {
            assertEquals(2, CounterClients.calculateCountClients(database));
        } catch (ClientDatabaseIsEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void calculateCountClients2() {
        ClientDatabase clientDatabase = new ClientDatabase();
        try {
            CounterClients.calculateCountClients(clientDatabase);
        } catch (ClientDatabaseIsEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void calculateCountClients3() {
        ClientDatabase database = new ClientDatabase();
        database.setClient(new Client("375291223454", "Hanna", TypeTariff.SMART));

        try {
            assertEquals(1, CounterClients.calculateCountClients(database));
        } catch (ClientDatabaseIsEmptyException e) {
            e.printStackTrace();
        }
    }
}