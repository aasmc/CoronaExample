package ru.aasmc.springpatterns.corona.services.doctors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.aasmc.coronalegacy.Treatment;
import ru.aasmc.coronalegacy.model.Patient;
import ru.aasmc.springpatternsstarter.Legacy;

import java.util.List;

@Component
public class Priest implements Doctor{


    @Autowired
    @Legacy
    List<Treatment> legacyTreatments;

    @Override
    public void treat(Patient patient) {
        legacyTreatments.forEach(t -> t.apply(patient));
    }

    @Override
    public String myType() {
        return "religion";
    }
}
