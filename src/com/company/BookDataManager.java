package com.company;

import java.util.List;

public class BookDataManager {

    DataStorage dataStorage;

    public BookDataManager(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public BookDataManager() {

    }

    public List<Book> getBooks() throws DataStorageNotSetException {

        if(dataStorage == null) {
            throw new DataStorageNotSetException("You need to set dataStorage property");
        }

        return dataStorage.getBooks();
    }

    public void saveBooks(List<Book> books) throws DataStorageNotSetException {

        if(dataStorage == null) {
            throw new DataStorageNotSetException("You need to set dataStorage property");
        }

        dataStorage.saveBooks(books);
    }

    public void setDataStorage(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }
}
