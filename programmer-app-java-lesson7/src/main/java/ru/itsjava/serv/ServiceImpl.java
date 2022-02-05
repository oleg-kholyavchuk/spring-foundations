package ru.itsjava.serv;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ServiceImpl implements Service {
    private final ThingService thingService;
    private final IOService ioService;

    @Override
    public void takeYourProduct() {
        System.out.println("Hello. We are glad to see you!");
        System.out.println("Here are our products");
        thingService.showingVeryNecessaryThing();
        System.out.println("Enter the exact amount of the product");
        int price = ioService.input();
        System.out.println("Here is your product");
        thingService.byChoosingVeryNecessaryThingPrice(price);
    }
}
