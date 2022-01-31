package ru.itsjava.services;

import lombok.SneakyThrows;

import java.util.Scanner;

public class IOSeviceHomeImpl implements IOSeviceHome {
    private final Scanner reader;

    public IOSeviceHomeImpl(Scanner scanner) {
        this.reader = new Scanner(System.in);
    }

    @SneakyThrows
    @Override
    public int input() {
        return reader.nextInt();
    }
}
