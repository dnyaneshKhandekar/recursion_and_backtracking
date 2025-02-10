package Leetcode;

class Pow {
    public double myPow(double x, int n) {
        double ans;
        if (n == 0) {
            return 1;
        }

        long exp = n;
        if (n < 0) {
            exp = -exp;
            return 1 / helper(x, exp);
        }
        return helper(x, exp);
    }
    double helper(double x, long n) {
        if( n == 1) {
            return x;
        }

        double halfAns;
        if( n % 2 != 0) {
            halfAns = helper(x, (n-1)/2 );
            return halfAns * halfAns * x;
        }
        // return  helper(x, (n)/2 ) *  helper(x, (n)/2 );
        halfAns = helper(x, n/2 );
        return halfAns * halfAns;
    }
}
