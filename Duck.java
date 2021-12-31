public class Duck implements Animal{
    @Override
    public void sound() {
        System.out.println("Quack - Called sound method inside the Duck class...");
    }

    @Override
    public void color() {
        System.out.println("White");
    }
}
