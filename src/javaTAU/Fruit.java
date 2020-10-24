package javaTAU;

public class Fruit {
    String color;
    int calories;

    public Fruit(String color){
        setColor(color);
        setCalories(1000);
    }

    public void makeJuice(){
        System.out.println("You made Juice.");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }
}
