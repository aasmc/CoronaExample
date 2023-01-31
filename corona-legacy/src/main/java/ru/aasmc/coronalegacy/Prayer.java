package ru.aasmc.coronalegacy;

import ru.aasmc.coronalegacy.model.Patient;

import javax.inject.Singleton;

@Singleton
public class Prayer implements Treatment{
    @Override
    public void apply(Patient patient) {
        System.out.println("Read three times CORONA GO AWAY before you snooze!");
    }
}
