import org.junit.jupiter.api.Test;
import java.lang.Character;

import static org.junit.jupiter.api.Assertions.*;

class RandomCharacterTest {

    @Test
    void getRandomLowerCaseLetter() {
        var c = new RandomCharacter();
        char value = c.getRandomLowerCaseLetter();
        char expectedVal = Character.toLowerCase(value);
        assertEquals(expectedVal, value);
    }

    @Test
    void getRandomUpperCaseLetter() {
        var c = new RandomCharacter();
        char value = c.getRandomUpperCaseLetter();
        char expectedVal = Character.toUpperCase(value);
        assertEquals(expectedVal, value);
    }

    @Test
    void getRandomDigitCharacter() {
        var c = new RandomCharacter();
        int value = c.getRandomDigitCharacter();
        assertTrue(0 <= value && value <= 9);
    }
    /*@Test
    void getRandomDigitCharacter() {
        var c = new RandomCharacter();
        int value = c.getRandomDigitCharacter();
        assertTrue(isPrimeNumber(value));
    }

    public boolean isPrimeNumber(int val){
            boolean isItPrime = true;

            if(val <= 1)
            {
                isItPrime = false;

                return isItPrime;
            }
            else
            {
                for (int i = 2; i<= val/2; i++)
                {
                    if ((val % i) == 0)
                    {
                        isItPrime = false;

                        break;
                    }
                }

                return isItPrime;
            }

    }*/

}