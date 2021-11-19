public class JavaLutioTemplate {
  public static void main(String[] args) {
    int testInput = 1;
    int testOutput = 1;
    test(testInput, testOutput);

  }

  public static void test(int input, int expected) {
    int testInput = input;
    int actual = solveIt(input);

    if (actual == expected) {
      System.out.println("✔️  Test Success!");
    } else {
      System.out.println("❌ Test Failed!");
      System.out.println("\t- Input : \"" + testInput + "\"");
      System.out.println("\t- Expected : \"" + expected + "\"");
      System.out.println("\t- Received : \"" + actual + "\"");
    }
  }

  public static int solveIt(int input) {
    return 1;
  }
}