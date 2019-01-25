package by.epam.javatraining.veranikayarashevich.tasks.maintask02.entity;

public class ClientBase {

    private static String[][] clients;
    private static int iterator = 0;

    public static void setClient(Client client) {
        clients = new String[iterator][0];
        clients[iterator][0] = String.valueOf(client.getPhoneNumber());
        clients = new String[iterator][1];
        clients[iterator][1] = client.getName();
        clients = new String[iterator][2];
        clients[iterator][2] = client.getTypeTariff().getClass().getName();

        iterator++;
    }

    public static String[][] getBase() {
        return clients;
    }
}
