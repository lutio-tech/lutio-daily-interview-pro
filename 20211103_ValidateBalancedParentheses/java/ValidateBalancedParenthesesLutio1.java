import java.util.Map;
import java.util.Stack;

public class ValidateBalancedParenthesesLutio1 {

  public static void main(String[] args) {
    String testInput = "";
    test(testInput, true);

    testInput = "((()))";
    test(testInput, true);

    testInput = "[()]{}";
    test(testInput, true);

    testInput = "({[)]";
    test(testInput, false);

    testInput = "(";
    test(testInput, false);

    testInput = ")";
    test(testInput, false);

    testInput = "{";
    test(testInput, false);

    testInput = "}";
    test(testInput, false);

    testInput = "[";
    test(testInput, false);

    testInput = "]";
    test(testInput, false);

    testInput = "()(){(())";
    test(testInput, false);

    testInput = "([{}])()";
    test(testInput, true);

    testInput = "({[)]}";
    test(testInput, false);
  }

  public static void test(final String input, final Boolean expected) {
    Boolean actual = hasBalancedBrackets(input);
    if (expected.equals(actual)) {
      System.out.println("✔️  Test Success!");
    } else {
      System.out.println("❌ Test Failed!");
      System.out.println("\t- Expected : \"" + expected + "\"");
      System.out.println("\t- Received : \"" + actual + "\"");
    }
  }

  public static Boolean hasBalancedBrackets(final String inputString) {
    if (inputString.isEmpty()) return true;

    final Map<Character, Character> bracketsCloseToOpenMap = Map.of(')', '(',
                                                                    '}', '{',
                                                                    ']', '[');

    Stack<Character> openBracketsStack = new Stack<>();

    for (Integer currentIndex = 0; currentIndex < inputString.length(); ++currentIndex) {
      Character currentCharacter = inputString.charAt(currentIndex);
      if (bracketsCloseToOpenMap.containsValue(currentCharacter)) {
        openBracketsStack.push(currentCharacter);
      } else if (bracketsCloseToOpenMap.containsKey(currentCharacter) && !openBracketsStack.isEmpty()) {
        Character matchingBracket = bracketsCloseToOpenMap.get(currentCharacter);
        if (!matchingBracket.equals(openBracketsStack.pop())) {
          return false;
        }
      } else {
        return false;
      }
    }

    if (openBracketsStack.isEmpty()) return true;

    return false;
  }

}
