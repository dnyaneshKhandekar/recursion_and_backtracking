package easy_recursion;

public class FibonacciSeries {
    public int fib(int n) {
        if ( n < 2) {
            return n;
        }
        int ans = helper(n-2) + helper(n-1);
        return ans;
    }
    int helper(int n) {
        if (n < 2) {
            return n;
        }
        return helper(n-2) + helper(n-1);
    }

}
