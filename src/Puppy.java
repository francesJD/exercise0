public class Puppy {
    int puppyAge;
    String species;
    String breed;
    int bodyLength;
    int weight;
    String eyeColor;
    String colour;
    String name;
    String gender;

    Puppy() {
        System.out.println("A puppy is initialized.");
    }

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("The dog's name is: " + puppyAge );
        return puppyAge;
    }

    public String getSpecies(String species) {
        return species;
    }
}
