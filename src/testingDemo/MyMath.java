package testingDemo;

/**
 * Utlity class for basic mathematical operations
 */
public class MyMath {

    /**
     * Adds two integers together.
     * @param number1 the first integer
     * @param number2 the second integer
     * @return the result of adding two integers
     */
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * Uses a loop to calculate the power of a number
     * @param base the base of the exponent
     * @param exponent the exponent
     * @return the power
     */
    public static double power(int base, int exponent) {0
        double result = 1;
        // If exponent is negative, do the following. 
        if (exponent < 0) {
            for (int i = -1; i >= exponent; i--) {
                result = result / base;
            }
        // If exponent is positive, do the following
        } else {
            for (int i = 1; i <= exponent; i++) {
                result = result * base;
         }
        }   

        return result;
    }
}


