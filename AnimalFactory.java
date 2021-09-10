public class AnimalFactory {
    // Build a getAnimal method to return the objects of animal types
    public Animal getAnimal(String animalType){
        if(animalType == null)
            return null;
        else if(animalType.equalsIgnoreCase("BEE"))
            return new Bee();
        else if(animalType.equalsIgnoreCase("DOG"))
            return new Dog();
        else if(animalType.equalsIgnoreCase("DUCK"))
            return new Duck();
        return null;
    }
}
