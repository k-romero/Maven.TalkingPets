package io.zipcoder.pethouse;

import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.utilities.Messages;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pets;
import java.lang.reflect.Array;
import java.util.HashMap;


public class PetHouse {
    Integer numOfPets;
    Dog dog = new Dog();
    Cat cat = new Cat();
    Bird bird = new Bird();
    Pets[] petHouse;
    Messages messages = new Messages();


    public void numberOfPets(){
        this.numOfPets = messages.promptForNumberOfPets();
    }

    public void placePetsInPetHouse(){
        this.petHouse = new Pets[numOfPets];
        for (int i = 0; i < petHouse.length; i++) {

        }
    }

    //1 = Dog 2 = Cat 3 = Bird
//    public Pets evalTypeOfPet(){
//        Integer result = messages.promptForTypeOfPet();
//        if(result == 1){
//        }else if(result == 2){
//
//        }else {
//
//        }
//
//    }




}
