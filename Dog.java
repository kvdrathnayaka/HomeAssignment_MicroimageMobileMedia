public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Barking - Called sound method inside the Dog class...");
    }

    @Override
    public void color() {
        System.out.println("Brown");
    }
}
