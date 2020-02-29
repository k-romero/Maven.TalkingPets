package io.zipcoder.utilities;

import org.junit.Assert;
import org.junit.Test;

public class MessagesTest {

    @Test
    public void promptNumberOfPetsTest(){
        //Given
        Messages messages = new Messages();
        Integer expected = 3;

        //When
        Integer actual = messages.promptForNumberOfPets();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void promptForTypeOfPetTest(){
        //Given
        Messages messages = new Messages();
        Integer expected = 1;

        //When
        Integer actual = messages.promptForTypeOfPet();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void promptForNameOfPetTest(){
        //Given
        Messages messages = new Messages();
        String expected = "Coco";

        //When
        String actual = messages.promptForNameOfPet();

        //Then
        Assert.assertEquals(expected,actual);
    }

}
