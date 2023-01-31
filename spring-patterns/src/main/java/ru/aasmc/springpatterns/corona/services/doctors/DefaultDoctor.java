package ru.aasmc.springpatterns.corona.services.doctors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.aasmc.coronalegacy.Treatment;
import ru.aasmc.coronalegacy.model.Patient;

import java.util.List;
import java.util.Random;

@Component
public class DefaultDoctor implements Doctor{
    @Autowired
    private List<Treatment> allTreatments;

    private Random random = new Random();

    @Override
    public void treat(Patient patient) {
        System.out.println("It will go away on its own!");
    }

    @Override
    public String myType() {
        return "default";
    }
}
