package ru.aasmc.springpatterns.corona.services;

import ru.aasmc.coronalegacy.model.Patient;
import ru.aasmc.springpatterns.corona.services.doctors.Doctor;

public interface Hospital {
    void register(String type, Doctor doctor);

    void processPatient(Patient patient);
}
