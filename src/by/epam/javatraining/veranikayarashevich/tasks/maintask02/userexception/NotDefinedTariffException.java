package by.epam.javatraining.veranikayarashevich.tasks.maintask02.userexception;

public class NotDefinedTariffException extends LogicalException {
    public NotDefinedTariffException(){
    }

    public NotDefinedTariffException(String msg) {
        super(msg);
    }
}
