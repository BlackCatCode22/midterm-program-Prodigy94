public class Animal {

    public static int numofAnimals = 0;

    // Create a constructor
    public Animal(){
        numofAnimals++;
    }

    String desc;
    String name;
    String birthSeason;
    String color;
    String weight;
    String Origin01;
    String Origin02;
    public void makeNoise(){
        System.out.println("\nThis is an animal object making noise...");
    }
    public String makeNoise2(){
        return "\nThis is a str returned form a method is my animal class";
    }
}
