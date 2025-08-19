public class revNum {
  public static void main(String[] args) {
    System.out.println(rev(1234));
    
  }
  public static int rev(int n){
    int digits = (int)(Math.log10(n))+1;
    return helper(n,digits);
  }
  private static int helper(int n,int digits){
    if(n%10==n){
      return n;
    }
    int rem = n%10;
    return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
  }
}
/*
Here's how the call stack unfolds when calling rev(1234):

Initial Call:
rev(1234)

digits = log10(1234) + 1 = 4
Calls helper(1234, 4)
Recursive Calls in helper(n, digits):
helper(1234, 4)

rem = 1234 % 10 = 4
Returns: 4 * 10^(4-1) + helper(123, 3) = 4000 + helper(123, 3)
helper(123, 3)

rem = 123 % 10 = 3
Returns: 3 * 10^(3-1) + helper(12, 2) = 300 + helper(12, 2)
helper(12, 2)

rem = 12 % 10 = 2
Returns: 2 * 10^(2-1) + helper(1, 1) = 20 + helper(1, 1)
helper(1, 1)

Base case: 1 % 10 == 1
Returns: 1
Unwinding the Stack:
helper(1, 1) → 1
helper(12, 2) → 20 + 1 = 21
helper(123, 3) → 300 + 21 = 321
helper(1234, 4) → 4000 + 321 = 4321
Final output: 4321 */
