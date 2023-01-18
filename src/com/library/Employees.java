package com.library;

import com.library.interfaces.Info;

public class Employees extends Person implements Info {

    private String profession;


    //переопределение метода toString
    @Override
    public String toString() {
        return "Номер ID: " +getId() +"Имя: "+ getFirstName()+ ", Фамилия: " + getLastName()+ ", Дата рождения: " + getBirthday()+ ", Профессия:" + profession + ".";
    }

    //блок инициализации
    {
        profession = "Не указан";
    }

    //методы
    @Override
    public void displayPerson () {
        System.out.print("Номер ID: " + getId() + ", ");
        System.out.print("Имя: " + getFirstName() + ", ");
        System.out.print("Фамилия: " + getLastName() + ", ");
        System.out.print("Дата рождения: " + getBirthday() + ", ");
        System.out.print("Профессия: " + getBirthday() + " .");
        System.out.println();
    }

    @Override
    public void showInfo(){
        System.out.println("Необходимо получить иформацию у сотрудников библиотеки");
    }

    // кострукторы
    public Employees(){super();}

    public Employees(int id, String firstName, String lastName, String birthday){
        super(id,firstName, lastName, birthday);   }



    //Инкапсуляция - геттеры и сеттеры

    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
}
