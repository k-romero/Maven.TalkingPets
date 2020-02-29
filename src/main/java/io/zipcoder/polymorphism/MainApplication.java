package io.zipcoder.polymorphism;

import io.zipcoder.pethouse.PetHouse;
import io.zipcoder.utilities.Messages;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        Messages messages = new Messages();
        PetHouse pethouse = new PetHouse();
        messages.welcomeMessage();
        messages.trackPetMessage();
        pethouse.numberOfPets();
        pethouse.placePetsInPetHouse();
        pethouse.printPetsInPetHouse();

    }



}


