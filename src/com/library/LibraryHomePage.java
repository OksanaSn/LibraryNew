package com.library;

public class LibraryHomePage {


    private String typeOfLibrary;
    private String login;


    //переопределение метода toString
    @Override
    public String toString() {
        return typeOfLibrary + ", " + login + " .";
    }

    //блок инициализации
    {
        typeOfLibrary = "Не указан";
        login = "Не указан";
    }

    //методы
    public void display () {
        System.out.print("Вид библиотеки: " + typeOfLibrary + ", ");
        System.out.print("Логин: " + login + " .");
        System.out.println();
    }


    // кострукторы
    public LibraryHomePage(){}

    public LibraryHomePage(String typeOfLibrary){
        this.typeOfLibrary = typeOfLibrary;   }
    public LibraryHomePage(String typeOfLibrary, int id){
        this.typeOfLibrary = typeOfLibrary;

    }
    public LibraryHomePage(String typeOfLibrary, int id, String login){
        this.typeOfLibrary = typeOfLibrary;
        this.login = login;
    }



    //Инкапсуляция - геттеры и сеттеры


    public String getTypeOfLibrary() {
        return typeOfLibrary;
    }

    public void setTypeOfLibrary(String typeOfLibrary) {
        this.typeOfLibrary = typeOfLibrary;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }






}
