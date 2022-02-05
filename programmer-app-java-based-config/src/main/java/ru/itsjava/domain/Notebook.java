package ru.itsjava.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;

@RequiredArgsConstructor
public class Notebook {
    private final String title;
    private final String size;
    private final String color;
    private final int price;

    @Override
    public String toString() {
        return "VeryNecessaryThing{" + "Title: " + title + "Size: " + size + "Color: " + color + "Price : " + price + '}';
    }

    public int getPrice() {
        return this.price;
    }
}
