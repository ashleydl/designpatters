package app;

public class Main {

    public static void main(String[] args) {
        BusChauffeur chauffeur = new BusChauffeur("Kees");

        Bus bus = new Bus(chauffeur);
        bus.info();

        //bushalte 1
        Schoolkind kwik = new Schoolkind("kwik");
        Schoolkind kwek = new Schoolkind("kwek");
        Schoolkind kwak = new Schoolkind("kwak");

        bus.instappen(kwik, kwek, kwak);
        bus.info();

        //bushalte 2
        Schoolkind andries = new Schoolkind("Andries");
        bus.instappen(andries);
        bus.info();

        //bushalte 3
        OudeMeneer dagobert = new OudeMeneer("Dagobert");
        bus.instappen(dagobert);
        bus.info();

        //controle
        Mens uitgestapte = (Mens) bus.uitstappen("Andries");
        bus.info();

        //hond stapt in de bus
        Dog loebas = new Dog("Loebas");
        bus.instappen(loebas);
        bus.info();
    }
    public void printNames() {
        System.out.println("Deze wezens zitten in de bus:");
        for(Map.Entry<String, Nameable> entry : stoelen.entrySet()) {
            String key = entry.getKey();
            System.out.println("- "+key);
        }
    }
}