package com.company.People;

public class Tixon extends People {
    private int year;

    public Tixon(String akka, String hope, String name, String secondName, String ability) {
        super(akka, hope, name, secondName, ability);
        this.year = 41;
    }

    public Tixon(String akka, String hope, String name, String secondName, String ability, int year) {
        super(akka, hope, name, secondName, ability);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void  display()
    {
        System.out.println("\nНежданно негаданно им оказывается ...." + super.getName() + " "+ super.getSecondName() +
        ".Видать Лидку чёрт попутал раз она не подкинула Усатому голосов. Да-да всем мы знаем, что избирается его жена, но кого это ебёт, если голосовали за  него. ");
        System.out.println("В народе прозвали его: " + super.getAkka() + ".Ему буквально "+ getYear()+ " года."
        + " Его лозунг: " +super.getHope()+ ". Особенность личности: " +super.getAbility());;
    };


}
