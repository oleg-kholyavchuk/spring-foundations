package ru.itsjava.services;

import ru.itsjava.domain.VeryNecessaryThing;

import java.util.List;

public class VeryNecessaryThingServiceImpl implements VeryNecessaryThingService {

    private final VeryNecessaryThing thing1 = new VeryNecessaryThing("'Super thing' ", "Big ", "Red ", 100500);
    private final VeryNecessaryThing thing2 = new VeryNecessaryThing("'So-so' ", "Little ", "Green ", 100);
    private final VeryNecessaryThing thing3 = new VeryNecessaryThing("'It'll do' ", "Average ", "Black ", 500);
    private final VeryNecessaryThing thing4 = new VeryNecessaryThing("'It'll do' ", "Average ", "Black ", 50);

    @Override
    public void showingVeryNecessaryThing() {
        List<VeryNecessaryThing> thingsTemp = List.of(thing1, thing2, thing3, thing4);

        for (VeryNecessaryThing thing : thingsTemp) {
            System.out.println(thing);
        }
    }

    @Override
    public void choosingVeryNecessaryThingPrice(int price) {
        List<VeryNecessaryThing> thingsTemp = List.of(thing1, thing2, thing3, thing4);
        VeryNecessaryThing thingTemp = null;

        for (VeryNecessaryThing thing : thingsTemp) {
            if (thing.getPrice() == price) {
                thingTemp = thing;
                System.out.println(thingTemp);
            }
        }
    }
}
