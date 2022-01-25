package ru.itsjava.services;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOSevviceImpl implements IOSevvice {
    private final BufferedReader reader;

    public IOSevviceImpl() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @SneakyThrows
    @Override
    public String input() {
        return reader.readLine();
    }
}
