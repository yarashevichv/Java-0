package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.utility;

import by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity.*;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.view.ConsolePrinter;
import by.epam.javatraining.veranikayarashevich.tasks.maintask02.view.LogPrinter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TariffFile {

    private static final String PATH = "E:\\EPAM\\Java0\\TariffFile.txt";
    private static final ConsolePrinter CONSOLE_PRINTER = new ConsolePrinter();
    private static final LogPrinter LOG_PRINTER = new LogPrinter();

    public static TariffDatabase readFile() throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(new FileInputStream(PATH));
        TariffDatabase result = new TariffDatabase();

        while (scanner.hasNext()) {
            Tariff tariff = new Tariff();
            String data = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(data, ",");

            while (tokenizer.hasMoreTokens()) {
                tariff.setCostOfTariff(Double.parseDouble(tokenizer.nextToken()));
                tariff.setPackageOfMinutes(Integer.parseInt(tokenizer.nextToken()));
                tariff.setType(TypeTariff.valueOf(tokenizer.nextToken()));

                switch (tariff.getTypeOfTariff()) {
                    case "BUSINESS":
                        BusinessTariff businessTariff = new BusinessTariff();

                        businessTariff.setPackageOfMinutesInOtherCountry(Integer.parseInt(tokenizer.nextToken()));
                        businessTariff.setPackageOfGigabytes(Double.parseDouble(tokenizer.nextToken()));
                        businessTariff.setPackageOfSMS(Integer.parseInt(tokenizer.nextToken()));
                        break;
                    case "CHILDREN":
                        ChildrenTariff childrenTariff = new ChildrenTariff();

                        childrenTariff.setPackageOfSMS(Integer.parseInt(tokenizer.nextToken()));
                        break;
                    case "COMFORT":
                        ComfortTariff comfortTariff = new ComfortTariff();

                        comfortTariff.setPackageOfGigabytes(Double.parseDouble(tokenizer.nextToken()));
                        break;
                    case "SMART":
                        SmartTariff smartTariff = new SmartTariff();

                        smartTariff.setPackageOfGigabytes(Double.parseDouble(tokenizer.nextToken()));
                        smartTariff.setPackageOfSMS(Integer.parseInt(tokenizer.nextToken()));
                        break;
                }
            }

            result.setTariff(tariff);
        }

        return result;
    }
}
