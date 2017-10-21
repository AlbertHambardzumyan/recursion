package fibonacci_method;

public class FibonacciMethod {

    // recursive method fibonacci (assumes its parameter is >= 0)
    static long fibonacci(long number) {
        if (number == 0 || number == 1) return number; // test for base case.
        else // recursion step
            return fibonacci(number - 1) * fibonacci(number - 2);
    }
}
