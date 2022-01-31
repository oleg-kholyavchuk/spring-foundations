package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.VeryNecessaryThingHome;

import java.util.List;

@RequiredArgsConstructor
public class VeryNecessaryThingServiceHomeImpl implements VeryNecessaryThingServiceHome {
    private final String title;
    private final String size;
    private final String color;
    private final int price;

    private final VeryNecessaryThingHome thing1 = new VeryNecessaryThingHome("'Super thing' ", "Big ", "Red ", 100500);
    private final VeryNecessaryThingHome thing2 = new VeryNecessaryThingHome("'So-so' ", "Little ", "Green ", 100);
    private final VeryNecessaryThingHome thing3 = new VeryNecessaryThingHome("'It'll do' ", "Average ", "Black ", 500);
    private final VeryNecessaryThingHome thing4 = new VeryNecessaryThingHome("'It'll do' ", "Average ", "Black ", 50);
    private final List<VeryNecessaryThingHome> thingsTemp = List.of(thing1, thing2, thing3, thing4);

    @Override
    public void showingVeryNecessaryThing() {
        for (VeryNecessaryThingHome thing : thingsTemp) {
            System.out.println(thing);
        }
    }

    @Override
    public void byChoosingVeryNecessaryThingPrice(int price) {
        VeryNecessaryThingHome thingTemp;

        for (VeryNecessaryThingHome thing : thingsTemp) {
            if (thing.getPrice() == price) {
                thingTemp = thing;
                System.out.println(thingTemp);
                break;
            }
        }
    }
}
