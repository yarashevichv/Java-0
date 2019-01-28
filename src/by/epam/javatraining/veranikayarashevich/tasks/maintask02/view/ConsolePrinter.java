package by.epam.javatraining.veranikayarashevich.tasks.maintask02.view;

public class ConsolePrinter implements Printable {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
