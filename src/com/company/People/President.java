package com.company.People;

public class President extends People {
    private int year;

    public President(String akka, String hope, String name, String secondName, String ability, int year) {
        super(akka, hope, name, secondName, ability);
        this.year = year;
    }

    public President(String akka, String hope, String name, String secondName, String ability) {
        super(akka, hope, name, secondName, ability);
        this.year = 65;
    }

    public int getYear() {
        return year;
    }

    public void display()
    {
        System.out.println("\nОй-ой, кажется в вашем островке стабильности переменны не предвидятся, победу одержит : "
                + super.getName()+" "+ super.getSecondName()  + " akka:" + super.getAkka() +
                ". Ему буквально " + getYear() + " лет. ");
        System.out.println ("Его Лозунг: " + super.getHope());
        System.out.println("Его суперсбособности: " + super.getAbility());
    };


}
