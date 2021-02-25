package com.company;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> books = new ArrayList<>();

    public BookList(List<Book> books) {
        this.books = books;
    }

    public BookList() {

    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
