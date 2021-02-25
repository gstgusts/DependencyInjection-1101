package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	    var bookManager = new BookDataManager(new JsonDataStorage());
//
//	    var books = bookManager.getBooks();
//
//	    var bookManager2 = new BookDataManager(new XmlDataStorage());
//
//	    var books2 = bookManager2.getBooks();
    }

    @Test
    public void write_json_file(){
        var bookManager = new BookDataManager(new JsonDataStorage());
        var book = new Book("Test");
        var book1 = new Book("Test 3");
        bookManager.saveBooks(Arrays.asList(book, book1));
    }

    @Test
    public void write_xml_file(){
        var bookManager = new BookDataManager(new XmlDataStorage());
        var book = new Book("Test");
        var book1 = new Book("Test 3");
        bookManager.saveBooks(Arrays.asList(book, book1));
    }

    @Test
    public void read_json_file() {
        var bookManager = new BookDataManager(new JsonDataStorage());
        var books = bookManager.getBooks();
        Assert.assertTrue(books.size() == 2);
    }

    @Test
    public void read_xml_file() {
        var bookManager = new BookDataManager(new XmlDataStorage());
        var books = bookManager.getBooks();
        Assert.assertTrue(books.size() == 2);
    }

    @Test
    public void read_xml_file_with_parameter_injection() {
        var bookManager = new BookDataManager();
        bookManager.dataStorage = new XmlDataStorage();
        var books = bookManager.getBooks();
        Assert.assertTrue(books.size() == 2);
    }

    @Test
    public void read_xml_file_with_method_injection() {
        var bookManager = new BookDataManager();
        bookManager.setDataStorage(new XmlDataStorage());
        var books = bookManager.getBooks();
        Assert.assertTrue(books.size() == 2);
    }

}
