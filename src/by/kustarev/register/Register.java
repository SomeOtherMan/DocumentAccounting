package by.kustarev.register;

import by.kustarev.document.Document;

public interface Register {

    void put(Document document);

    String getInfo(Document document);

    void printElements();
}
