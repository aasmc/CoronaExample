package ru.aasmc.springpatterns.corona.services;

import org.springframework.stereotype.Service;
import ru.aasmc.coronalegacy.model.Patient;
import ru.aasmc.springpatterns.corona.services.doctors.DefaultDoctor;
import ru.aasmc.springpatterns.corona.services.doctors.Doctor;

import java.util.HashMap;
import java.util.Map;

@Service
public class HospitalImpl implements Hospital {

    private Map<String, Doctor> map = new HashMap<>();

    @Override
    public void register(String type, Doctor doctor) {
        map.put(type, doctor);
    }

    @Override
    public void processPatient(Patient patient) {
        Doctor doctor = map.getOrDefault(patient.getMethod(), new DefaultDoctor());
        doctor.treat(patient);
    }
}
