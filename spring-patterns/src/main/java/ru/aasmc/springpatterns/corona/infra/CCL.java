package ru.aasmc.springpatterns.corona.infra;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class CCL extends ClassLoader {

    @Override
    @SneakyThrows
    public Class<?> findClass(String name) {
        String fileName = "target/classes/" + name.replace('.', File.separatorChar) + ".class";
        byte[] bytecode = Files.newInputStream(Path.of(fileName)).readAllBytes();
        return defineClass(name, bytecode, 0, bytecode.length);
    }
}
