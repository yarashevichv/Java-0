package by.epam.javatraining.veranikayarashevich.tasks.maintask02.view;

import org.apache.log4j.Logger;

public class LogPrinter implements Printable {

    static Logger logger = Logger.getRootLogger();

    @Override
    public void print(String message) {
        logger.info(message);
    }
}
