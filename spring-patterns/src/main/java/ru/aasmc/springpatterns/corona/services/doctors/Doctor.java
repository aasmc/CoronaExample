package ru.aasmc.springpatterns.corona.services.doctors;

import org.springframework.beans.factory.annotation.Autowired;
import ru.aasmc.coronalegacy.model.Patient;
import ru.aasmc.springpatterns.corona.services.Hospital;

public interface Doctor {

    void treat(Patient patient);

    @Autowired
    default void regMe(Hospital hospital) {
        hospital.register(myType(), this);
    }

    String myType();

    String TRADITIONAL = "traditional";
    String FOLK = "folk";

}
