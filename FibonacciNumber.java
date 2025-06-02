class Solution {
    public int fib(int n) {

        int n1 = 0, n2 = 1;
        int fibbo = 0;
        if (n == 2) {
            return n1 + n2;
        } else if (n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                fibbo = n1 + n2;
                n1 = n2;
                n2 = fibbo;

            }
            return fibbo;
        }
    }
}
