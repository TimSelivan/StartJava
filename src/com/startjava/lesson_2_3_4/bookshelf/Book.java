package com.startjava.lesson_2_3_4.bookshelf;

public class Book {
    private String writer;
    private String name;
    private int year;

    public Book(String writer, String name, int year) {
        this.writer = writer;
        this.name = name;
        this.year = year;
    }

    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
