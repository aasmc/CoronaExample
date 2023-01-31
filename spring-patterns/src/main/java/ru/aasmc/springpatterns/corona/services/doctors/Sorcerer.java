package ru.aasmc.springpatterns.corona.services.doctors;

import org.springframework.stereotype.Component;
import ru.aasmc.coronalegacy.Treatment;
import ru.aasmc.coronalegacy.model.Patient;
import ru.aasmc.springpatterns.corona.services.treatments.Cans;
import ru.aasmc.springpatterns.corona.services.treatments.Garlic;
import ru.aasmc.springpatterns.corona.services.treatments.Sauna;
import ru.aasmc.springpatterns.corona.services.treatments.Vodka;
import ru.aasmc.springpatternsstarter.InjectList;

import java.util.List;

@Component(Doctor.FOLK)
public class Sorcerer implements Doctor {

    @InjectList({Vodka.class, Sauna.class, Cans.class, Garlic.class})
    private List<Treatment> treatments;

    @Override
    public void treat(Patient patient) {
        System.out.println("Figuring out the treatment...");
        treatments.forEach(t -> t.apply(patient));
    }

    @Override
    public String myType() {
        return Doctor.FOLK;
    }
}
