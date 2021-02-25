package com.company;

import java.util.List;

public interface DataStorage {
    List<Book> getBooks();
    void saveBooks(List<Book> books);
}
