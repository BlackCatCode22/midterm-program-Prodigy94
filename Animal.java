import java.util.Date;



public class Animal {


    public static int numofAnimals = 0;


    // Animal attributes

    private String animalID;
    private String animalName;
    private Date animalBirthdate;
    private String animalColor;
    private char animalGender;
    private float animalWeight;
    private String animalArrivingFrom;

    // Animal getters and setters

    public String getAnimalID(){
        return animalID;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }


    public String getAnimalName(){
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Date getAnimalBirthdate(){
        return animalBirthdate;
    }

    public void setAnimalBirthdate(Date animalBirthdate) {
        this.animalBirthdate = animalBirthdate;
    }

    public String getAnimalColor(){
        return  animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public char getAnimalGender(){
        return  animalGender;
    }

    public void setAnimalGender(char animalGender) {
        this.animalGender = animalGender;
    }

    public float getAnimalWeight(){
        return animalWeight;
    }

    public void setAnimalWeight(float animalWeight) {
        this.animalWeight = animalWeight;
    }

    public String getAnimalArrivingFrom(){
        return animalArrivingFrom;
    }

    public void setAnimalArrivingFrom(String animalArrivingFrom) {
        this.animalArrivingFrom = animalArrivingFrom;
    }

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

