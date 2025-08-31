class Solution {
    public int tribonacci(int n) {
        int n1 = 0, n2 = 1, n3 = 1;
        int tribbo = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            for (int i = 0; i <= n - 3; i++) {
                tribbo = n1 + n2 + n3;
                n1 = n2;
                n2 = n3;
                n3 = tribbo;
            }
            return tribbo;
        }

    }
}
