package javaTAU;

public class Banana extends Fruit{

    public Banana(){
         super("yellow");
    }

         @Override
        public void makeJuice(){
            System.out.println("You made Banana Juice.");
        }

}

