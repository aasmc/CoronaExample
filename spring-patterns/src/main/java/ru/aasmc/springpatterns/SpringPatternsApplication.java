package ru.aasmc.springpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.aasmc.coronalegacy.model.Patient;
import ru.aasmc.springpatterns.corona.services.doctors.Priest;

@SpringBootApplication
public class SpringPatternsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringPatternsApplication.class, args);
        context.getBean(Priest.class).treat(Patient.builder().build());
    }

}
