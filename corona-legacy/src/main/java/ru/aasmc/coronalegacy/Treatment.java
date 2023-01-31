package ru.aasmc.coronalegacy;

import ru.aasmc.coronalegacy.model.Patient;

public interface Treatment {
    void apply(Patient patient);

    String ALCOHOL = "alcohol";
}
