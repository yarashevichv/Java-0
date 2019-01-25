package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.ClientBaseIsEmptyException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CounterClientsTest {

    @Test
    public void calculateCountClients1() {
        String[][] clients = {{"375291223454"}, {"375447568894"}, {"375333576873"}};

        try {
            assertEquals(3, CounterClients.calculateCountClients(clients));
        } catch (ClientBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void calculateCountClients2() {
        String[][] clients = {};
        try {
            CounterClients.calculateCountClients(clients);
        } catch (ClientBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void calculateCountClients3() {
        String[][] clients = {{"375291223454", "Hanna", "SMART"}};

        try {
            assertEquals(1, CounterClients.calculateCountClients(clients));
        } catch (ClientBaseIsEmptyException e) {
            e.printStackTrace();
        }
    }
}