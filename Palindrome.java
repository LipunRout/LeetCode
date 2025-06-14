class Palindrome {
      public boolean isPalindrome(int x) {
            int n = x, rev = 0, rem = 0;
            if (n < 0) {
                  return false;
            }
            while (x > 0) {
                  rem = x % 10;
                  rev = rev * 10 + rem;
                  x = x / 10;
            }
            if (n == rev) {
                  return true;
            } else {
                  return false;
            }

      }
}
