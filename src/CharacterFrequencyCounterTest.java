import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    
    @Test
    void testCharacterShowsUpMultipleTimesGivesCorrectFrequency() {
        // arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        // act
        int actual = counter.getFrequency('l');
        // assert
        assertEquals(2, actual);
    }

    @Test
    void testGetRelativeFrequencyReturns0ForMissingCharacter() {
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        double actual = counter.getRelativePercentage('x');
        assertEquals(0.0, actual, 0.00001);
    }
}