package by.epam.javatraining.veranikayarashevich.tasks.maintask02.model.entity;

import java.util.ArrayList;
import java.util.List;

public class TariffDatabase {

    private List<Tariff> tariffs = new ArrayList<Tariff>();

    public void setTariff(Tariff tariff) {
        tariffs.add(tariff);
    }

    public List<Tariff> getDatabase() {
        return tariffs;
    }
}
