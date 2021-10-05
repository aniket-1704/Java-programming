package exception_handling;

// Java program to demonstrate exception is thrown
// how the runTime system searches the call stack
// to find appropriate exception handler.
class ExceptionThrown {
    private static int i;

    static int divideByZero(int a, int b) {
        int i = a / b;
        return i;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        ExceptionThrown.i = i;
    }

    static int computeDivision(int a, int b) {
        int res = 0;
        try {
            res = divideByZero(a, b);
        } catch (ArithmeticException ex) {
            throw new ArithmeticException("cant divide by 0");
        }
        return res;
    }

    public static void main(String args[]) {
        int a = 1;
        int b = 0;
        try {
            setI(computeDivision(a, b));
        }
        // matching ArithmeticException
        catch (ArithmeticException ex) {
            // getMessage will print description of exception(here / by zero)
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("hello in finally");
        }

    }
}