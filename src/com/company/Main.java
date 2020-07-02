package com.company;


import com.company.People.*;

public class Main {

    public static void main(String[] args) {

        People[] people = new People[4];



        people[0] = new Babariko("Жирный Кот", "Кайфовал и радовался жизни", "Виктор",
                "Бабарико", "Пугать Деда");


        people[1] = new President("Сашка 3%", "Всем по пяцьсот. Жээстачайшэ наказажым Майданутых,Беларусь, спи спокойно. ",
                "Сашка",
                "Лукашенко", "Подлизываться, обещать, шавелить усами.");

        people[2] = new Tixon("Тапок", "Стоп Таракан", "Сергей", "Тихановский",
                " Маяк для автозака и проституток.");
        people[3]= new Putin("", "", "Владимир","Путин","");

        int a=1;
        int b =4;
        int random_number =a + (int) (Math.random()*b);

        System.out.println("\nКТО ЖЕ ПОБЕДИТ НА ВЫБОРАХ ПРЕЗИДЕНТА РЕСПУБЛИКИ БЕЛАРУСЬ???");

        switch (random_number)
        {
            case 1: people[0].display();
            break;

            case 2: people[1].display();
            break;

            case 3: people[2].display();
            break;

            default: people[3].display();
                break;
        }



    }
}
