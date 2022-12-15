package src.main.java.hillel.hw;

import src.main.java.hillel.hw.exception.ArraySizeException;
import src.main.java.hillel.hw.exception.ArrayDataException;

public class ArrayValueCalculator {
    public static int calculating(String[][] array) throws ArraySizeException, ArrayDataException {

        final int ARRAY_LENGTH = 4;
        int sum = 0;

            if (array.length != ARRAY_LENGTH)
                throw new ArraySizeException(
                        "Array Size Exception, "
                                + array.length
                                + " not equal "
                                + ARRAY_LENGTH);

            for (int i = 0; i < array.length; i++) {
                if (array[i].length != ARRAY_LENGTH)
                    throw new ArraySizeException(
                            "Array Size Exception, "
                                    + array[i].length
                                    + ", in line "
                                    + i
                                    + " not equal "
                                    + ARRAY_LENGTH);
            }

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            for (int a = 0; a < ARRAY_LENGTH; a++) {
                try {
                    sum += Integer.parseInt((array[i][a]).trim());
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(
                            "Exception in "
                                    + array[i][a]
                                    + " line - "
                                    + (i + 1)
                                    + "  field - "
                                    + (a + 1));
                }
            }
        }
        return sum;
    }
}