package javaTAU;

public class Apple extends Fruit{


    public Apple(){
      super("green");
      setCalories(500);
      System.out.println("Calories "+ calories);
    }

    @Override
    public void makeJuice(){
        System.out.println("You made Apple Juice.");
    }

    protected void removeSeeds(){
        System.out.println("Seeds are removed");
    }
}
