package com.library;

public class Books {
    private int bookId;
    public String bookName;
    public String bookAuthor;


    //переопределение метода toString
    @Override
    public String toString() {
        return "Номер ID книги: " + bookId + ", Название книги: " + bookName+ ", ФИО автора: " +bookAuthor+ ".";
    }

    //блок инициализации
    {

        bookId = 0;
        bookName = "Не указан";
        bookAuthor = "Не указан";

    }

    //методы

    public void displayBookInformation () {
        System.out.print("Номер ID книги: " + getBookId() + ", ");
        System.out.print("Название книги: " + getBookName() + ", ");
        System.out.print("ФИО автора: " + getBookAuthor() + " .");
        System.out.println();
    }

    // кострукторы
    public Books(){}

    public Books(int bookId, String bookName, String bookAuthor){

        this.bookId=bookId;
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
    }


    //Инкапсуляция - геттеры и сеттеры


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
