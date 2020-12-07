package ds;

import ds.bit.HammingWeight;

import static org.junit.Assert.assertEquals;

public class HammingWeightTest {

    @org.junit.Test
    public void hammingWeight() {
        assertEquals(31,
                new HammingWeight().hammingWeight(0b00000000000000000000000000001011));
    }
}