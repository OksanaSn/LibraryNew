package com.library;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String birthday;



    //переопределение метода toString
    @Override
    public String toString() {
        return "Номер ID: " +id + ", Имя: " +firstName +", Фамилия: " + lastName + ", Дата рождения: " + birthday+ ".";
    }

    //блок инициализации
    {
        firstName = "Не указан";
        lastName = "Не указан";
        birthday = "Не указан";
        id = 0;
    }

    //методы

    public void displayPerson () {
        System.out.print("Номер ID: " + getId() + ", ");
        System.out.print("Имя: " + getFirstName() + ", ");
        System.out.print("Фамилия: " + getLastName() + ", ");
        System.out.print("Дата рождения: " + getBirthday() + " .");
        System.out.println();
    }

    // кострукторы
    public Person(){}

    public Person(int id, String firstName, String lastName, String birthday){
        this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthday=birthday;}


    //Инкапсуляция - геттеры и сеттеры


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
