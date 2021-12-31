public class Bee implements Animal{
    @Override
    public void sound() {
        System.out.println("Buzzing - Called sound method inside the Bee class...");
    }

    @Override
    public void color() {
        System.out.println("Red");
    }
}
