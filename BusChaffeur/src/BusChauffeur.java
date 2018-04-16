public class BusChauffeur {

    private String name;

    public BusChauffeur(String name) {
        this.name = name;
    }
    public boolean ZijnGelijk(Dog dog, Cat cat){
        return dog.equals(cat);
    }
    public boolean ZijnGelijk(Dog dog, Dog dog2){
        return (dog == dog2);
    }
}
