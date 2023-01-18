package com.library;

import com.library.interfaces.BookInfo;

public class ChildBook extends Books implements BookInfo {
    private String childBookInfo;

    @Override
    public void showInfoBook(){
        System.out.println(childBookInfo);
    }


    //переопределение метода toString
    @Override
    public String toString() {
        return getBookId() + ", " + getBookName()+ ", " +getBookAuthor()+ ".";
    }

    //блок инициализации
    {
        childBookInfo = "No information";
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
    public ChildBook(){super();}
    public ChildBook(int bookId, String bookName, String bookAuthor){
        super(bookId,bookName,bookAuthor);
    }


    //Инкапсуляция - геттеры и сеттеры


    public String getChildBookInfo() {
        return childBookInfo;
    }

    public void setChildBookInfo(String childBookInfo) {
        this.childBookInfo = childBookInfo;
    }
}
