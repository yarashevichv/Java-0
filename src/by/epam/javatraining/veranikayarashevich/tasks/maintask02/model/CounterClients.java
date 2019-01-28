package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.Client;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.ClientDatabase;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception.ClientDatabaseIsEmptyException;

import java.util.List;

public class CounterClients {

    public static int calculateCountClients(ClientDatabase database) throws ClientDatabaseIsEmptyException {
        ClientDatabase temp = database;
        List<Client> clients = database.getDatabase();
        int result = clients.size();

        if (result == 0) {
            throw new ClientDatabaseIsEmptyException();
        } else {
            return result;
        }
    }
}
