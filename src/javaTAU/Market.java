package javaTAU;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.makeJuice();

        apple = new Banana();
        System.out.println("Magically changed");
        apple.makeJuice();
    }
}
