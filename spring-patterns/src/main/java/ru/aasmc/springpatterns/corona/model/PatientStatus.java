package ru.aasmc.springpatterns.corona.model;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@AllArgsConstructor
public class PatientStatus {
    Boolean positive;
    LocalDateTime when;
}
