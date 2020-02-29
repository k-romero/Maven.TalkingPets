package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void setBirdNameTest(){
        //Given
        Bird bird = new Bird();
        String expected = "Pixie";

        //When
        bird.setName("Pixie");
        String actual = bird.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getBirdNameTest(){
        //Given
        Bird bird = new Bird();
        String expected = "Trixie";

        //When
        bird.setName("Trixie");
        String actual = bird.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void birdSpeakTest(){
        //Given
        Bird bird = new Bird();
        String expected = "peep!";

        //When
        String actual = bird.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }

}
