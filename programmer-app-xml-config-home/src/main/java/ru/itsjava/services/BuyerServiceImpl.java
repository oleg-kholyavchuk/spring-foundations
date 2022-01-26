package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BuyerServiceImpl implements BuyerService {
    private final VeryNecessaryThingService veryNecessaryThingService;
    private final IOSevvice ioSevvice;

    @Override
    public void takeYourProduct() {
        System.out.println("Hello. We are glad to see you!");
        System.out.println("Here are our products");
        veryNecessaryThingService.veryNecessaryThing();
        System.out.println("Enter the exact amount of the product");
        int price = ioSevvice.input();
        System.out.println("Here is your product");
        veryNecessaryThingService.getVeryNecessaryThingService(price);
    }
}
