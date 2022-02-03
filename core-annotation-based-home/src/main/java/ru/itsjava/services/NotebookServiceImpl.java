package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.itsjava.domain.Notebook;

import java.util.List;

@Component("notebook")
@RequiredArgsConstructor
public class NotebookServiceImpl implements NotebookService {

    private final Notebook notebook1 = new Notebook("Super cool laptop ", "Big ", "Red ", 100500);
    private final Notebook notebook2 = new Notebook("So-so laptop ", "Average ", "Green ", 100);
    private final Notebook notebook3 = new Notebook("Normal laptop ", "Average ", "Black ", 500);
    private final Notebook notebook4 = new Notebook("Lousy ", "Average ", "Black ", 50);
    private final List<Notebook> notebookTemp = List.of(notebook1, notebook2, notebook3, notebook4);


    @Override
    public void showingNotebook() {
        for (Notebook notebook : notebookTemp) {
            System.out.println(notebook);
        }
    }

    @Override
    public void byChoosingNotebookPrice(int price) {
        Notebook notebooksTemp;

        for (Notebook notebook : notebookTemp) {
            if (notebook.getPrice() == price) {
                notebooksTemp = notebook;
                System.out.println(notebooksTemp);
                break;
            }
        }
    }
}