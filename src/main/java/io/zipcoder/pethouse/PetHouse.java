package io.zipcoder.pethouse;

import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.utilities.Console;
import io.zipcoder.utilities.Messages;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pets;


public class PetHouse {
    Integer numOfPets;
    Pets[] petHouse;
    Pets newPet;
    Messages messages = new Messages();
    Console console = new Console(System.in,System.out);


    public void numberOfPets(){
        this.numOfPets = messages.promptForNumberOfPets();
    }

    public void placePetsInPetHouse(){
        this.petHouse = new Pets[this.numOfPets];
        for (int i = 0; i < petHouse.length; i++) {
            evalTypeOfPetAndCreateNewPet();
            petHouse[i] = this.newPet;
        }
    }

    //1 = Dog 2 = Cat 3 = Bird
    public void evalTypeOfPetAndCreateNewPet(){
        Integer result = messages.promptForTypeOfPet();
        if(result == 1){
           this.newPet = new Dog(messages.promptForNameOfPet());
        }else if(result == 2){
            this.newPet = new Cat(messages.promptForNameOfPet());
        }else {
            this.newPet = new Bird(messages.promptForNameOfPet());
        }
    }

    public void printPetsInPetHouse(){
        for (Pets pet : petHouse) {
            console.println(pet.getName());
        }
    }




}
