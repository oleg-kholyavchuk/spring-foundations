package ru.itsjava.serv;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domai.Domain;

import java.util.List;

@RequiredArgsConstructor
public class ThingServiceImpl implements ThingService {

    private final Domain thing1 = new Domain("'Super thing' ", "Big ", "Red ", 100500);
    private final Domain thing2 = new Domain("'So-so' ", "Little ", "Green ", 100);
    private final Domain thing3 = new Domain("'It'll do' ", "Average ", "Black ", 500);
    private final Domain thing4 = new Domain("'It'll do' ", "Average ", "Black ", 50);
    private final List<Domain> thingsTemp = List.of(thing1, thing2, thing3, thing4);

    @Override
    public void showingVeryNecessaryThing() {
        for (Domain thing : thingsTemp) {
            System.out.println(thing);
        }
    }

    @Override
    public void byChoosingVeryNecessaryThingPrice(int price) {
        Domain thingTemp;
        for (Domain thing : thingsTemp) {
            if (thing.getPrice() == price) {
                thingTemp = thing;
                System.out.println(thingTemp);
                break;
            }
        }
    }
}