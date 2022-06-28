package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Shelf {
    private int booksNumber = 0;
    private Book[] books = new Book[10];

    public Shelf() {
    }

    public int getBooksNumber() {
        return booksNumber;
    }
    public void setBooksNumber(int booksNumber) {
        this.booksNumber = booksNumber;
    }
    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book books, int index) {
        this.books[index] = books;
    }
    public void howManyBooks() {
        for(int i = 0; i < books.length; i++) {
            if(books[i] != null) {
               booksNumber++;
            }
        }
        System.out.println(booksNumber);
    }
    public void howMuchFreeSpace() {
        int  temp = 0;
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                temp++;
            }
        }
        System.out.println(temp);
    }
    public void showTheShelf() {
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                System.out.println((i + 1) + "\t<     >");
            } else {
                System.out.println((i + 1) + " " + books[i].getWriter() + " " + books[i].getName() + " " + books[i].getYear());
            }
        }
    }
    public void addTheBook() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type the writer: ");
        String writer = scan.nextLine();
        System.out.print("Type the name of the book: ");
        String name = scan.nextLine();
        System.out.print("Type the year: ");
        int year = scan.nextInt();
        Book book = new Book(writer, name, year);
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }
    public void deleteTheBook() {
        System.out.print("Type the name of the book you want to delete: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for(int i = 0; i < books.length; i++) {
            if(name.equals(books[i].getName())) {
                books[i] = null;
                break;
            }
        }
    }
    public void findTheBook() {
        System.out.println("Type the name of the book: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for(int i = 0; i < books.length; i++) {
            if(name.equals(books[i].getName())) {
                System.out.println("Book info: " + books[i].getWriter() + ", " + books[i].getName() + ", " + books[i].getYear());
                break;
            }
        }
    }
}
