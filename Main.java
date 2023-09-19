//6 string fields,
// DESC, (Description)
// birth SZN,
// color,
// weight,
// origin 01,
// origin 02
// Driver class for Zoo


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my Zoo warmup!");

        // Create an Animal object.
        Animal myNewAnimal = new Animal();

        myNewAnimal.desc = "this is my description";

        System.out.println("\nthe desc of the new animal is: " +myNewAnimal.desc);

        myNewAnimal.birthSeason = "this is my birth season";

        System.out.println("\nthe birth season of this animal is: "+myNewAnimal.birthSeason);

        myNewAnimal.color = "The color of the animal";

        System.out.println("\nThe color of this animal is: " + myNewAnimal.color);

        //Create an Array list to hold the animal Objects!

        ArrayList<Animal> animalList = new ArrayList<>();







        // open the arrival Animals text file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\BE218\\Desktop\\arrivingAnimals.txt"));
            String myLine;





            while ((myLine = reader.readLine()) !=null){
                //System.out.println(myLine);
                String[] myArray = myLine.split(",");
                //System.out.println("\n myArray[0] is " +myArray[0]);
                //System.out.println("\nmyArray[1] is" + myArray[1]);

                // Create an animal object from the Animal Class

                Animal anyOldAnimal = new Animal();
                // fill the objects data fields
                anyOldAnimal.desc = myArray[0];
                anyOldAnimal.birthSeason = myArray[1];
                anyOldAnimal.color = myArray[2];
                anyOldAnimal.weight = myArray[3];
                anyOldAnimal.Origin01 = myArray[4];
                anyOldAnimal.Origin02 = myArray[5];

                // Add the newly created animal object to the array list
                animalList.add(anyOldAnimal);


            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

        // We are done with the text file
        // Output the Array List
        for (Animal animal: animalList){
            System.out.println(animal.desc);
            System.out.println(animal.birthSeason);
            System.out.println(animal.color);
            System.out.println(animal.weight);
            System.out.println(animal.Origin01);
            System.out.println(animal.Origin02);
            System.out.println("\n\n");
        }



    }
}