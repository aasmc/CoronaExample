package ru.aasmc.springpatterns.corona.services.doctors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.aasmc.coronalegacy.Treatment;
import ru.aasmc.coronalegacy.model.Patient;

import java.util.List;

@Component
public class Physician implements Doctor {

    @Autowired
    private List<Treatment> treatments;

    private int currentTreatment;

    @Override
    public void treat(Patient patient) {
        if (currentTreatment == treatments.size()) {
            currentTreatment = 0;
        }

        Treatment treatment = treatments.get(currentTreatment);
        System.out.println("Today we will try: " + treatment.getClass().getSimpleName());
        treatment.apply(patient);
    }

    @Override
    public String myType() {
        return Doctor.TRADITIONAL;
    }
}
