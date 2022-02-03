package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProgrammerServiceImpl implements ProgrammerService{
    private final NotebookService notebookService;
    private final IOService ioService;

    @Override
    public void takeYourProduct() {
        System.out.println("Hello. We are glad to see you!");
        System.out.println("Here are our products");
        notebookService.showingNotebook();
        System.out.println("Enter the exact amount of the product");
        int price = ioService.input();
        System.out.println("Here is your product");
        notebookService.byChoosingNotebookPrice(price);
    }
}
