package by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception;

public class TariffBaseIsEmptyException extends LogicalException {
    public TariffBaseIsEmptyException() {
    }

    public TariffBaseIsEmptyException(String msg) {
        super(msg);
    }
}
