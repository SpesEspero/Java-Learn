package com.company.People;

public class Putin  extends People{

    public Putin(String akka, String hope, String name, String secondName, String ability) {
        super(akka, hope, name, secondName, ability);
    }

    public void display()
    {
        System.out.println("\nОпа-на! Этому парню удалось и рыбку съесть, и нах*й сесть. Президентом РБ стал :" + super.getName()
        + " " + super.getSecondName() );
        System.out.println("Этот удалец малого того, что себе срок  президенства в РФ обнулил, " +
                "так ещё  решил РБ прихватить. Поприветствуйте своего нового Царя!"  );
    };
}
