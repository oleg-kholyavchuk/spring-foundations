package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProgrammerServiceImpl implements ProgrammerService {
    private final NotebookService notebookService;
    private final IOSevvice ioSevvice;

    @Override
    public void hiToNewProgrammer() {
        System.out.println("Enter your name");
        String name = ioSevvice.input();
        System.out.println("Hello " + name);
        System.out.println("Your computer: " + notebookService.getNotebook());
    }
}
