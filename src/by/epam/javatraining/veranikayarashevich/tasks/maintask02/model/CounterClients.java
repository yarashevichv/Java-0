package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity.ClientBase;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.ClientBaseIsEmptyException;

public class CounterClients {

    public static int calculateCountClients(String[][] clients) throws ClientBaseIsEmptyException {
        String[][] array = clients;
        int result = array.length;

        if (result == 0) {
            throw new ClientBaseIsEmptyException();
        } else {
            return result;
        }
    }
}
