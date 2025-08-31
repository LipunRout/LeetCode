<<<<<<< HEAD
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
=======
class Solution {
    public boolean isPalindrome(int x) {
        int n=x, rev=0, rem=0;
        if(n<0){
            return false;
        }
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(n==rev){
            return true;
        }
        else{
            return false ;
        }

    }
>>>>>>> 1a57811d631afb92464be8566178b496d3e41d93
}
