package ru.itsjava.services;

import lombok.SneakyThrows;

import java.util.Scanner;

public class IOSeviceImpl implements IOSevice {
    private final Scanner reader;

    public IOSeviceImpl() {
        this.reader = new Scanner(System.in);
    }

    @SneakyThrows
    @Override
    public int input() {
        return reader.nextInt();
    }
}
