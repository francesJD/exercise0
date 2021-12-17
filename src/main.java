public class main {
    public static void main(String[] args){
        // Instantiate bathroom
        Bathroom bathroom1 = new Bathroom();
        bathroom1.setSize(50);
        Bathroom bathroom2 = new Bathroom();
        bathroom2.setSize(50);
        Bathroom bathroom3 = new Bathroom();
        bathroom3.setSize(50);

        // Instantiate bedroom
        Bedroom bedroom1 = new Bedroom();
        bedroom1.setSize(100);
        Bedroom bedroom2 = new Bedroom();
        bedroom2.setSize(200);
        Bedroom bedroom3 = new Bedroom();
        bedroom3.setSize(300);

        // Instantiate cat
        Cat cat1 = new Cat();
        cat1.setName("cat1");
        Cat cat2 = new Cat();
        cat2.setName("cat2");
        Cat cat3 = new Cat();
        cat3.setName("cat3");

        // Instantiate dog
        Dog dog1 = new Dog();
        dog1.setName("dog1");
        Dog dog2 = new Dog();
        dog2.setName("dog2");
        Dog dog3 = new Dog();
        dog3.setName("dog3");

        // Instantiate home
        Home home1 = new Home();
        home1.setPeople("Amy");
        home1.getOwner();
        home1.getAddressInfo();
        Home home2 = new Home();
        home2.setPeople("Bob");
        home2.getOwner();
        home2.getAddressInfo();
        Home home3 = new Home();
        home3.setPeople("Cathy");
        home3.getOwner();
        home3.getDirectionInfo();

        // Instantiate kitchen
        Kitchen kitchen1 = new Kitchen();
        kitchen1.setSize(100);
        Kitchen kitchen2 = new Kitchen();
        kitchen2.setSize(500);
        Kitchen kitchen3 = new Kitchen();
        kitchen3.setSize(600);

        // Instantiate living room
        LivingRoom lr1 = new LivingRoom();
        lr1.setSize(400);
        LivingRoom lr2 = new LivingRoom();
        lr2.setSize(500);
        LivingRoom lr3 = new LivingRoom();
        lr3.setSize(600);

        // Instantiate people
        People person1 = new People();
        person1.setName("Amy");
        People person2 = new People();
        person2.setName("Bob");
        People person3 = new People();
        person3.setName("Cathy");

        // Instantiate puppy
        Puppy puppy1 = new Puppy();
        puppy1.getSpecies("Cat");
        Puppy puppy2 = new Puppy();
        puppy2.getSpecies("Cat");
        Puppy puppy3 = new Puppy();
        puppy3.getSpecies("Dog");

        // Instantiate study room
        StudyRoom sr1 = new StudyRoom();
        sr1.setSize(100);
        StudyRoom sr2 = new StudyRoom();
        sr2.setSize(500);
        StudyRoom sr3 = new StudyRoom();
        sr3.setSize(600);
    }
}
