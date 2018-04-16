public class Main {

    public static void main(String[] args) {
        BusChauffeur chauffeur = new BusChauffeur("Kees");
       // Dog Henk = new Dog();

        //Dieren van de buurvrouw
       // Dog Piet = new Dog();
        //Cat kat = new Cat();



        //Bus
        Bus bus = new Bus(chauffeur);


        //CTRL D nieuwe regel
        SchoolKind Kwik = new SchoolKind("Kwik");
        SchoolKind Kwek = new SchoolKind("Kwek");
        SchoolKind Kwak = new SchoolKind("Kwak");

        bus.instappen(Kwik, Kwek, Kwak);
        System.out.println(bus);

        //Bushalte 2
        SchoolKind Andries = new SchoolKind("Andries");
        bus.instappen(Andries);
        System.out.println(bus);

        //Bushalte 3
        OudeMeneer Dagobert = new OudeMeneer("Dagobert");
        bus.instappen(Dagobert);
        System.out.println(bus);
    }
}
