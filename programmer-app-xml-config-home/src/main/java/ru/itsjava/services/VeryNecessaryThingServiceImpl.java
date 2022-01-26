package ru.itsjava.services;

import ru.itsjava.domain.VeryNecessaryThing;

import java.util.ArrayList;
import java.util.List;

public class VeryNecessaryThingServiceImpl implements VeryNecessaryThingService {

    VeryNecessaryThing thing1 = new VeryNecessaryThing("'Super thing' ", "Big ", "Red ", 100500);
    VeryNecessaryThing thing2 = new VeryNecessaryThing("'So-so' ", "Little ", "Green ", 100);
    VeryNecessaryThing thing3 = new VeryNecessaryThing("'It'll do' ", "Average ", "Black ", 500);
    VeryNecessaryThing thing4 = new VeryNecessaryThing("'It'll do' ", "Average ", "Black ", 50);

    @Override
    public void veryNecessaryThing(){
        List<VeryNecessaryThing> thingsTemp = new ArrayList<>();

        thingsTemp.add(thing1);
        thingsTemp.add(thing2);
        thingsTemp.add(thing3);
        thingsTemp.add(thing4);

        for (VeryNecessaryThing thing : thingsTemp) {
            System.out.println(thing);
        }
    }

    @Override
    public void getVeryNecessaryThingService(int price) {
        List<VeryNecessaryThing> thingsTemp = new ArrayList<>();
        VeryNecessaryThing thingTemp = null;

        thingsTemp.add(thing1);
        thingsTemp.add(thing2);
        thingsTemp.add(thing3);
        thingsTemp.add(thing4);

        for (VeryNecessaryThing thing :  thingsTemp) {
            if (thing.getPrice() == price) {
                thingTemp = thing;
                System.out.println(thingTemp);
            }
        }
    }
}
