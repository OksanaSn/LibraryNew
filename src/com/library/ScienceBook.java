package com.library;

import com.library.interfaces.BookInfo;

public class ScienceBook extends Books implements BookInfo {


    private String scienceBookInfo;

    @Override
    public void showInfoBook(){
        System.out.println(scienceBookInfo);
    }


    //переопределение метода toString
    @Override
    public String toString() {
        return getBookId() + ", " + getBookName()+ ", " +getBookAuthor()+ ".";
    }

    //блок инициализации
    {
        scienceBookInfo = "No information";
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
    public ScienceBook(){}
    public ScienceBook(int bookId, String bookName, String bookAuthor){
        super(bookId,bookName,bookAuthor);
    }


    //Инкапсуляция - геттеры и сеттеры


    public String getScienceBookInfo() {
        return scienceBookInfo;
    }

    public void setScienceBookInfo(String scienceBookInfo) {
        this.scienceBookInfo = scienceBookInfo;
    }
}
