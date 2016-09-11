package guvi;

public class Longestpalindrome 
{
	 public static void main(String ... args) 
	    {
	        String str = "xyzmalayalamabc";
	        String lgpal= getLongestPalindrome(str);
	        System.out.println("String: " + str);
	        System.out.println("Longest Palindrome: " + lgpal);
	    }
	 public static String getLongestPalindrome(final String input)
	 {
        int ri = 0,li = 0;
        String currentPalindrome = "", longestPalindrome = "";
        for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++)
        {
           li = centerIndex - 1;  ri = centerIndex + 1;
        while (li >= 0 && ri < input.length()) 
        {
         if (input.charAt(li) != input.charAt(ri)) 
        {
          break;
         }
       currentPalindrome = input.substring(li, ri + 1);
       longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome : longestPalindrome;
       li--; 
       ri++;
       }
      }
      return longestPalindrome;
    }
   
}
