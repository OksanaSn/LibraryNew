package com.library;

import com.library.interfaces.Info;

public class Clients extends Person implements Info{



    private String address;
    private int idCard;
    private int idCardNum;
    private String showInfo;


    //переопределение метода toString
    @Override
    public String toString() {
        return "Номер ID: " +getId() +"Имя: "+ getFirstName()+ ", Фамилия: " + getLastName()+ ", Дата рождения: " + getBirthday()+ ", Адрес: " + address+ ", Номер серии паспорта: " + idCard+ ", Код паспорта: " + idCardNum + " .";
    }

    //блок инициализации
    {

        address = "Не указан";
        idCard = 0;
        idCardNum = 0;

    }




    //методы
    @Override
    public void displayPerson () {
        System.out.print("Номер ID: " + getId() + ", ");
        System.out.print("Имя: " + getFirstName() + ", ");
        System.out.print("Фамилия: " + getLastName() + ", ");
        System.out.print("Дата рождения: " + getBirthday() + ", ");
        System.out.print("Адрес: " + getAddress() + ", ");
        System.out.print("Номер серии паспорта: " + getIdCard() + ", ");
        System.out.print("Код паспорта: " + getIdCardNum() + " .");
        System.out.println();
    }

    @Override
    public void showInfo(){
        System.out.println("Необходимо получить иформацию у сотрудников библиотеки");
    }

    // кострукторы
    public Clients(){super();}

    public Clients(int id, String firstName, String lastName, String birthday){
        super(id,firstName, lastName, birthday);   }


    //Инкапсуляция - геттеры и сеттеры


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(int idCardNum) {
        this.idCardNum = idCardNum;
    }
}
