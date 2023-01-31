package ru.aasmc.springpatterns.corona.services.treatments;

import ru.aasmc.coronalegacy.Treatment;
import ru.aasmc.coronalegacy.model.Patient;

@TreatmentAnnotation(type = Treatment.ALCOHOL)
public class Vodka implements Treatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("Drink vodka before meal!");
    }
}
