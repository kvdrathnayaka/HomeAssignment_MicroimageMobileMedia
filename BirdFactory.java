public class BirdFactory extends AbstractFactory{
    @Override
    Animal getAnimal(String typeOfAnimal) {
        if(typeOfAnimal.equalsIgnoreCase("DUCK"))
            return new Duck();
        else return null;
    }
}
