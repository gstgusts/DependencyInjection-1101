package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XmlDataStorage implements DataStorage {
    private static final String FILE_PATH = "src/com/company/books.xml";

    private ObjectMapper mapper;

    public XmlDataStorage() {
        mapper = new XmlMapper();
    }

    @Override
    public List<Book> getBooks() {
        try {
            var result = mapper.readValue(new File(FILE_PATH), BookList.class);
            return result.getBooks();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    @Override
    public void saveBooks(List<Book> books) {
        var obj = new BookList(books);
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE_PATH), obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
