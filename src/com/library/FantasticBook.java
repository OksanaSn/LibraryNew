package com.library;

import com.library.interfaces.BookInfo;

public class FantasticBook extends Books implements BookInfo {

    private String fantasticBookInfo;

    @Override
    public void showInfoBook(){
        System.out.println(fantasticBookInfo);
    }


    //переопределение метода toString
    @Override
    public String toString() {
        return getBookId() + ", " + getBookName()+ ", " +getBookAuthor()+ ".";
    }

    //блок инициализации
    {
        fantasticBookInfo = "No information";
    }

    //методы
    @Override
    public void displayBookInformation () {
        System.out.print("Номер ID книги: " + getBookId() + ", ");
        System.out.print("Название книги: " + getBookName() + ", ");
        System.out.print("ФИО автора: " + getBookAuthor() + " .");
        System.out.println();
    }

    // кострукторы
    public FantasticBook(){super();}
    public FantasticBook(int bookId, String bookName, String bookAuthor){
        super(bookId,bookName,bookAuthor);
    }


    //Инкапсуляция - геттеры и сеттеры


    public String getFantasticBookInfo() {
        return fantasticBookInfo;
    }

    public void setFantasticBookInfo(String fantasticBookInfo) {
        this.fantasticBookInfo = fantasticBookInfo;
    }
}
