package com.company;

class Person {
    protected String name;
    protected String vorname;
    protected int personalnummer;

    public Person(String name, String vorname, int personalnummer) {
        this.name = name;
        this.vorname = vorname;
        this.personalnummer = personalnummer;
    }
}

class Chef extends Person {
    private String abteilung;

    public Chef(String name, String vorname, int personalnummer, String abteilung) {
        super(name, vorname, personalnummer);
        this.abteilung = abteilung;
    }
}

class Fachangestellter extends Person {
    private Chef vorgesetzter;

    public Fachangestellter(String name, String vorname, int personalnummer, Chef vorgesetzter) {
        super(name, vorname, personalnummer);
        this.vorgesetzter = vorgesetzter;
    }
}

class Firma {
    private Person[] mitarbeiter;

    public Firma(Person[] p) {
        mitarbeiter = p;
    }
}

public class Personen {
    public static void main(String[] args) {
        Firma f = new Firma(
                new Person[]{
                        new Chef("Sattler", "Beatrice", 25, "Verkauf")});
    }
}
