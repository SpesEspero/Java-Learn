package com.company.People;

abstract public class People {

   private  String  akka ;
   private String  hope;
      private String secondName;
   private String name;
   private   String  ability;


    public People(String akka, String hope, String name, String secondName, String ability) {
        this.akka = akka;
        this.hope = hope;
        this.name = name;
        this.secondName = secondName;
        this.ability = ability;
    }

    public String getAkka() {
        return akka;
    }

    public void setAkka(String nationality) {
        this.akka = nationality;
    }

    public String getHope() {
        return hope;
    }

    public void setHope(String hope) {
        this.hope = hope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public abstract void display();
}
