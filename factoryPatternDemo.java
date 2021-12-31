/**
 * factoryPattern
 */
public class factoryPatternDemo {

    public static void main(String[] args) {
        System.out.println("Running Application...\n\n");

        final FactoryProducer factoryProducer = new FactoryProducer();

        final AbstractFactory birdFactory = factoryProducer.getFactory("Bird_Factory");
        birdFactory.getAnimal("Duck").color();
    }
}
