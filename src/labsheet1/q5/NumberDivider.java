package labsheet1.q5;

public class NumberDivider {
    public static int divideNumbers(int dividend, int divisor) throws DivisionByZeroException{
        try {
            if(divisor == 0 ){
                throw new DivisionByZeroException("Number cannot be divided by zero");
            }else
                return dividend/divisor;
        }catch (DivisionByZeroException e){
         System.err.println("Error: "+ e.getMessage());
         throw e;
        }
    }

    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("The result is: "+ result);
        }catch (DivisionByZeroException e){
            e.getMessage();
        }
    }
}
