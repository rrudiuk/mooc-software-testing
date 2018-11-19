package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy gHappy;

    @BeforeEach
    public void initialize() {
        this.gHappy = new GHappy();
    }

    @Test
    public void unhappyNoSymbols() {
        Assertions.assertFalse(gHappy.gHappy("xxxx"));
    }

    @Test
    public void unhappyOneSymbol() {
        Assertions.assertFalse(gHappy.gHappy("xxgxx"));
    }

    @Test
    public void happyTwoSymbols() {
        Assertions.assertTrue(gHappy.gHappy("xxggxx"));
    }

    @Test
    public void happyManySymbols() {
        Assertions.assertTrue(gHappy.gHappy("xxggxxggxx"));
    }

    @Test
    public void happyManyOtherSymbols() {
        Assertions.assertTrue(gHappy.gHappy("xxggyygyggxx"));
    }

}
