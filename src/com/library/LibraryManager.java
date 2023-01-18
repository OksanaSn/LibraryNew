package com.library;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryManager {


        static List<Books> books= new ArrayList<>();
        static List<Clients> clients= new ArrayList<>();

        public static void main(String[] args) {

            books.add(new Books(1 , "Первая книга", "Классный автор"));
            books.add(new Books(2 , "Вторая книга", "Очень классный автор"));
            books.add(new Books(3 , "Третья книга", "Лучший автор"));


            System.out.println("Список общедоступных книг:");
            System.out.println();

            // Вывод списка книг
            for (Books c : books){
                System.out.println(c);}

            System.out.println();
            System.out.println("Список клиентов:");
            System.out.println();
            
            Clients client1 = new Clients();
            client1.setFirstName("Петр");
            client1.setLastName("Шкар");
            client1.setBirthday("15.05.1978");
            //client1.displayPerson();

            Clients client2 = new Clients();
            client2.setFirstName("Вася");
            client2.setLastName("Иванов");
            client2.setBirthday("14.05.1989");
            //client2.displayPerson();



            clients.add(client1);
            clients.add(client2);

            // Вывод списка клиентов
            for (Clients c : clients){
                System.out.println(c);}


            


        }
    }

