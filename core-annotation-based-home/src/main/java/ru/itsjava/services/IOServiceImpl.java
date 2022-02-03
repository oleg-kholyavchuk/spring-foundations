package ru.itsjava.services;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Scanner;


public class IOServiceImpl implements IOService{
    private final Scanner reader;

    public IOServiceImpl(InputStream inputStream) {
        this.reader = new Scanner(inputStream);
    }

    @SneakyThrows
    @Override
    public int input() {
        return reader.nextInt();
    }
}
