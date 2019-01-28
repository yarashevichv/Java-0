package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity;

import java.util.ArrayList;
import java.util.List;

public class ClientDatabase {

    private List<Client> clients = new ArrayList<Client>();

    public void setClient(Client client) {
        clients.add(client);
    }

    public List<Client> getDatabase() {
        return clients;
    }
}
