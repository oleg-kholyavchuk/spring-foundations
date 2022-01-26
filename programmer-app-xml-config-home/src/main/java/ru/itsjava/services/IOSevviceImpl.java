package ru.itsjava.services;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOSevviceImpl implements IOSevvice {
    private final Scanner reader;

    public IOSevviceImpl() {
        this.reader = new Scanner(System.in);
    }

    @SneakyThrows
    @Override
    public int input() {
        return reader.nextInt();
    }
}
