import java.util.Arrays;

public class SortLlistWith3UniqueNumbersLutio1 {
  public static void main(String[] args) {
    int[] testInputList = { 1 };
    int[] testOutputList = { 1 };
    test(testInputList, testOutputList);

    testInputList = new int[] { 2, 3, 1 };
    testOutputList = new int[] { 1, 2, 3 };
    test(testInputList, testOutputList);

    testInputList = new int[] { 1, 2, 3 };
    testOutputList = new int[] { 1, 2, 3 };
    test(testInputList, testOutputList);

    testInputList = new int[] { 3, 3, 3 };
    testOutputList = new int[] { 3, 3, 3 };
    test(testInputList, testOutputList);

    testInputList = new int[] { 3, 2, 2, 1, 3, 2, 1 };
    testOutputList = new int[] { 1, 1, 2, 2, 2, 3, 3 };
    test(testInputList, testOutputList);

    testInputList = new int[] { 3, 3, 2, 1, 3, 2, 1 };
    testOutputList = new int[] { 1, 1, 2, 2, 3, 3, 3 };
    test(testInputList, testOutputList);
}

  public static void test(int[] input, int[] expected) {
    int[] testInput = input;
    sortList(input);
    int[] actual = input;

    if (Arrays.equals(actual, expected)) {
      System.out.println("✔️  Test Success!");
    } else {
      System.out.println("❌ Test Failed!");
      System.out.println("\t- Input : \"" + Arrays.toString(testInput) + "\"");
      System.out.println("\t- Expected : \"" + Arrays.toString(expected) + "\"");
      System.out.println("\t- Received : \"" + Arrays.toString(actual) + "\"");
    }
  }

  public static void sortList(int[] inputList) {
    int[] countsArray = {0, 0 , 0};
    // Time complexity - O(n)
    for (int i = 0; i < inputList.length; ++i) {
      int x = inputList[i];
      ++countsArray[x - 1];
    }

    int index = 0;
    // Time complexity - O(n) ==> (3 * count of each number)
    for (int i = 0; i < countsArray.length; ++i) {
      for (int j = 0; j < countsArray[i]; ++j) {
        inputList[index] = i + 1;
        ++index;
      } 
    }
  }

}