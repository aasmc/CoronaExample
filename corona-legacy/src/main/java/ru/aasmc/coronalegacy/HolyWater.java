package ru.aasmc.coronalegacy;

import ru.aasmc.coronalegacy.model.Patient;

import javax.inject.Inject;

public class HolyWater implements Treatment{

    @Inject
    private GodForce godForce;

    @Override
    public void apply(Patient patient) {
        godForce.blessTheWater();
        System.out.println("Drink a glass of holy water with three glasses of vodka per day!");
    }
}
