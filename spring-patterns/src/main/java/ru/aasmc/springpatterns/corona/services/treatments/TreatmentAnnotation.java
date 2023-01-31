package ru.aasmc.springpatterns.corona.services.treatments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Component
@Qualifier
@Autowired
public @interface TreatmentAnnotation {
    String type();
}
