public class BitOperations {
    /**
     *
     * @param number
     * @param nBit - sequential number of bit
     * @return bit value(0,1); -1 in the case of wrong bit's number
     */
    public static int getBitValue(int number, int nBit) {
        if (nBit < 0 || nBit > 31) {
            return -1;
        }
        return  ((number&(1<<nBit))==0)?0:1;
    }

    /**
     *
     * @param number
     * @param nBit - position of the bit to set 1
     * @return new value with changed specified bit to 1.
     *             0 in case of wrong bit position
     */
    public static int setBitValue(int number, int nBit) {
        //TODO setBitValue - set the current bit to 1
        if (nBit < 0 || nBit > 31) {
            return 0;
        }
        return (number | (1 << nBit));
    }
    /**
     *
     * @param number
     * @param nBit - position of the bit which set to 0
     * @return new value with changed specified bit to 0.
     *             -1 in case of wrong bit position
     */
    public static int resetBit(int number, int nBit) {
        //TODO resetBit
        return -1;
    }

    /**
     *
     * @param number
     * @param nBit - position of the bit to toggle
     * @return new value with toggled specified bit
     *          -1 in case of wrong bit position
     */
    public static int toggleBit(int number, int nBit) {
        //TODO toggleBit
        return 0;
    }

    /**
     ** 10 with only one operator + and without *
     * @param number
     * @return number * 10 with only one operator + and without *
     */
    public static int fastMultiply10(int number) {
        //TODO fastMultiply10
        return -1;
    }

    /**
     *
     * @param number
     * @return / 10 with only one operator - and without /
     */
    public static int fastDivision(int number) {
        return -1;
    }
}
