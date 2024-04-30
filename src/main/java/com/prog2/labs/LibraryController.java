/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bridj
 */
public class LibraryController {

    private static volatile LibraryApplication instance;
    private Book book;
    private LibraryModel libraryModel;
    private LibraryView libraryView;

    public LibraryController(LibraryModel model, LibraryView view) {
        this.libraryModel = libraryModel;
        this.libraryView = libraryView;
    }

    public LibraryModel getLibraryModel() {
        return libraryModel;
    }

    public void setLibraryModel(LibraryModel libraryModel) {
        this.libraryModel = libraryModel;
    }

    public void setBookName(String name, int index) {
        libraryModel.getBooks().get(index).setTitle(name);
    }

    public String getBookName(int index) {
        return libraryModel.getBooks().get(index).getTitle();
    }

    public void addBookToLibrary(Book book) {
        libraryModel.getBooks().add(book);
    }

    public void removeBookToLibrary(Book book) {
        libraryModel.getBooks().remove(book);
    }

}
