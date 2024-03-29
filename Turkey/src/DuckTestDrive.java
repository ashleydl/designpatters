public class DuckTestDrive {
    public static void main (String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck TurkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says..");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says..");
        testDuck(TurkeyAdapter);

        System.out.println("\nThe TurkeyAdapyter says..");
        testDuck(TurkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
