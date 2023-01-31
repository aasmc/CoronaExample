package ru.aasmc.springpatterns.corona.services.doctors;

import org.springframework.stereotype.Component;
import ru.aasmc.coronalegacy.model.Patient;

@Component
public class Shaman implements Doctor{
    @Override
    public void treat(Patient patient) {
        System.out.println("Shaman is treating a patient!");
    }

    @Override
    public String myType() {
        return "magic";
    }
}
