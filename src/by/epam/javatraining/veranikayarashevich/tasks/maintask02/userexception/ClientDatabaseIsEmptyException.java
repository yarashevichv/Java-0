package by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception;

public class ClientDatabaseIsEmptyException extends LogicalException {
    public ClientDatabaseIsEmptyException() {
    }

    public ClientDatabaseIsEmptyException(String msg) {
        super(msg);
    }
}
