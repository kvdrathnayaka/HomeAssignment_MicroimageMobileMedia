public class MammalFactory extends AbstractFactory{
    @Override
    Animal getAnimal(String typeOfAnimal) {
        if(typeOfAnimal.equalsIgnoreCase("DOG"))
            return new Dog();
        return null;
    }
}
