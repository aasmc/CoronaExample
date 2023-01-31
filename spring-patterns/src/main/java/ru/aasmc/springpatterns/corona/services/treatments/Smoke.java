package ru.aasmc.springpatterns.corona.services.treatments;

import org.springframework.stereotype.Component;
import ru.aasmc.coronalegacy.Treatment;
import ru.aasmc.coronalegacy.model.Patient;

@Component
public class Smoke implements Treatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("Inhale smoke before sleep!");
    }
}
