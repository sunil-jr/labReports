package labsheet1.q5;

public class NumberDivider {
    public static int divide(int dividend, int divisor) throws DivisionByZeroException {
        try {
            if (divisor == 0) {
                throw new DivisionByZeroException("Number "+dividend+" cannot be divided by "+ divisor);
            } else
                return dividend / divisor;
        } catch (DivisionByZeroException e) {
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("The result is: " + result);
        } catch (DivisionByZeroException e) {
            e.getMessage();
        }
    }
}