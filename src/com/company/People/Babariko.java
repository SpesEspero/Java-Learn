package com.company.People;

public class Babariko  extends People {
    private int year;

    public Babariko(String akka, String hope, String name, String secondName, String ability) {
        super(akka, hope, name, secondName, ability);
        this.year = 56;
    }

    public Babariko(String akka, String hope, String name, String secondName, String ability, int year) {
        super(akka, hope, name, secondName, ability);
        this.year = year;
    }

    public int getYear() {
        return year;
    }


    public void display(){
        System.out.println("\nСегодня праздник у девчат, ибо им стал любимиц публики и дам:  " + super.getName() +
                " "+ super.getSecondName() +". Ему " + getYear() + "  лет ."  );
        System.out.println("ЦИК, а также действующий прездинет охарактеризовали его как:  "+super.getAkka()
                +", его цель, чтобы каждый" + super.getHope());
        System.out.println("Супер способность: " + super.getAbility());
    }
}
