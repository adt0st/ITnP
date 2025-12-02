public class Palindrome {
  public static void main(String[] args) {  
    for (int i = 0; i < args.length; i++) { 
      String s = args[i];  
      System.out.println(isPalindrome(s));
    }
  }
  
  public static String reverseString(String s) {
    StringBuilder sb = new StringBuilder(s);
    String reversed = sb.reverse().toString();
    return reversed;
  }
  
  public static boolean isPalindrome(String s) {
    return s.equals(reverseString(s));
  }
}
