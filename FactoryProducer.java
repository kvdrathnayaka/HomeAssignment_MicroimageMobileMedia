public class FactoryProducer {
    AbstractFactory getFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("BIRD_FACTORY"))
            return new BirdFactory();
        else if(factoryType.equalsIgnoreCase("MAMMAL_FACTORY"))
            return new MammalFactory();
        else return null;
    }
}
