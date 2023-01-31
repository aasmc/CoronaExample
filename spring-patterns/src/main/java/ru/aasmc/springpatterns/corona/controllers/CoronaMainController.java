package ru.aasmc.springpatterns.corona.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.aasmc.coronalegacy.model.Patient;
import ru.aasmc.springpatterns.corona.model.PatientStatus;
import ru.aasmc.springpatterns.corona.psr.PSRService;
import ru.aasmc.springpatterns.corona.services.Hospital;
import ru.aasmc.springpatternsstarter.CoronaController;

import java.time.LocalDateTime;

@CoronaController
@RequiredArgsConstructor
@RequestMapping("/corona/")
public class CoronaMainController {
    private final Hospital hospital;
    private final PSRService diagnosticService;

    @PostMapping("treat")
    public Patient treat(@RequestBody Patient patient) {
        hospital.processPatient(patient);
        return patient;
    }

    @GetMapping("diagnose")
    public PatientStatus getPatientStatus() {
        return new PatientStatus(diagnosticService.isPositive(), LocalDateTime.now());
    }
}
