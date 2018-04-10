//Eerst implementeer je de interface van de type die je al adapt. De interface die mensen zien

    public class TurkeyAdapter implements Duck{
    Turkey turkey;

    //Een reference naar een object dat we voor de adapter gebruiken gaat door de constructor.
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    //Nu implenteren we de methode in de interface. De quack() tussen classes is simpelweg een methode.
    public void quack() {
        turkey.gobble();
    }

    //Even though both interface have a fly() method, Turkeys fly in short spurts - they can't do
    //long distance flying like ducks. To map between a Duck's fly() method and a
        //Turkey's, we need to call the Turkey's fly() method five times to make up for it.
    public void fly() {
        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
