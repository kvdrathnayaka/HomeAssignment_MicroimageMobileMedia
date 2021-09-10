/**
 * factoryPattern
 */
public class factoryPatternDemo {

    public static void main(String[] args) {
        System.out.println("Running Application...\n\n");
        // Create a AnimalFactory object
        AnimalFactory animalFactory = new AnimalFactory();

        // Create Bee object
        Animal animal = animalFactory.getAnimal("BEE");
        // Call the sound method of Bee
        animal.sound();

        // Create Dog object
        Animal animal1 = animalFactory.getAnimal("DOG");
        // Call the sound method of Dog
        animal1.sound();

        // Create Duck object
        Animal animal2 = animalFactory.getAnimal("DUCK");
        // Call the sound method of Duck
        animal2.sound();
    }
}
