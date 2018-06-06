import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitOperationsTest {


    @Test
    void getBitValue() {
        int value=0x100823;
        assertEquals(1, BitOperations.getBitValue(value,0));
        assertEquals(1, BitOperations.getBitValue(value,5));
        assertEquals(0, BitOperations.getBitValue(value,4));
        assertEquals(0, BitOperations.getBitValue(value,6));
    }

    @Test
    void setValue() {
        int value=0x100823;


 //       assertEquals(0x100823, BitOperations.setBitValue(value,0));
//        assertEquals(1, BitOperations.setBitValue(value,5));
//        assertEquals(0, BitOperations.setBitValue(value,4));
//        assertEquals(0, BitOperations.setBitValue(value,6));
    }
}