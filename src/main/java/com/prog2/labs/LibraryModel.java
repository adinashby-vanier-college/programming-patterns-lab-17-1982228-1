/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bridj
 */
public class LibraryModel {

    private ArrayList<Book> books;
    private ArrayList<LibraryObserver> observers;

    public LibraryModel() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addObserver(LibraryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(LibraryObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (LibraryObserver observer : observers) {
            observer.update();
        }
    }

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getId().equals(book.getId())) {
                return; 
            }
        }
        books.add(book);
        notifyObservers();
    }

    public void removeBook(Book book) {
        books.remove(book);
        notifyObservers();
    }

    public ArrayList<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public ArrayList<Book> searchBook(String criteria) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(criteria)
                    || book.getAuthor().contains(criteria)
                    || String.valueOf(book.getYear()).contains(criteria)
                    || book.getId().contains(criteria)) {
                results.add(book);
            }
        }
        return results;
    }
}
