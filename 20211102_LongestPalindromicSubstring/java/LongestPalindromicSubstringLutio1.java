public class LongestPalindromicSubstringLutio1 {

  public static void main(String[] args) {
    String testString = "";
    test(testString, "");

    testString = "a";
    test(testString, "a");

    testString = "aa";
    test(testString, "aa");

    testString = "baa";
    test(testString, "aa");

    testString = "aab";
    test(testString, "aa");

    testString = "aaa";
    test(testString, "aaa");

    testString = "baaa";
    test(testString, "aaa");

    testString = "aaab";
    test(testString, "aaa");

    testString = "abc";
    test(testString, "a");

    testString = "aba";
    test(testString, "aba");

    testString = "abba";
    test(testString, "abba");

    testString = "baabbba";
    test(testString, "abbba");

    testString = "banana";
    test(testString, "anana");

    testString = "million";
    test(testString, "illi");

    testString = "racecartrackhasnoracecaronit";
    test(testString, "noracecaron");
  }

  public static void test(final String input, final String expected) {
    String actual = getLongestPalindromicSubstring(input);
    if (expected.equals(actual)) {
      System.out.println("✔️  Test Success!");
    } else {
      System.out.println("❌ Test Failed!");
      System.out.println("\t- Expected : \"" + expected + "\"");
      System.out.println("\t- Received : \"" + actual + "\"");
    }
  }

  public static String getLongestPalindromicSubstring(final String inputString) {
    if (inputString.isEmpty())
      return "";

    String longestPalindromicSubstring = inputString.substring(0, 1);

    for (Integer currentIndex = 1; currentIndex < inputString.length(); ++currentIndex) {
      Integer leftIndex = currentIndex - 1;
      Integer rightIndex = currentIndex;
      String evenLengthPalindrome = getLongestPalindromicSubstringBySpanningOut(inputString, leftIndex, rightIndex);
      if (evenLengthPalindrome.length() > longestPalindromicSubstring.length()) {
        longestPalindromicSubstring = evenLengthPalindrome;
      }

      rightIndex = currentIndex + 1;
      String oddLengthPalindrome = getLongestPalindromicSubstringBySpanningOut(inputString, leftIndex, rightIndex);
      if (oddLengthPalindrome.length() > longestPalindromicSubstring.length()) {
        longestPalindromicSubstring = oddLengthPalindrome;
      }
    }

    return longestPalindromicSubstring;
  }

  private static String getLongestPalindromicSubstringBySpanningOut(final String inputString, final Integer startIndex,
      final Integer endIndex) {
    Integer leftIndex = startIndex;
    Integer rightIndex = endIndex;
    while (leftIndex >= 0 && rightIndex < inputString.length()) {
      Character leftCharacter = inputString.charAt(leftIndex);
      Character rightCharacter = inputString.charAt(rightIndex);
      if (!leftCharacter.equals(rightCharacter)) {
        break;
      }
      --leftIndex;
      ++rightIndex;
    }

    return inputString.substring(leftIndex + 1, rightIndex);
  }
}
