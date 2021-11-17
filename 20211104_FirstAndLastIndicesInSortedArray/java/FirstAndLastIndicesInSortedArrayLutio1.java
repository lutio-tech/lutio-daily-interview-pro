import java.util.Arrays;

public class FirstAndLastIndicesInSortedArrayLutio1 {
  public static void main(String[] args) {
    // [1], 1 ==> [0, 0]
    int[] testInput = {1};
    int testTarget = 1;
    int[] result = {0, 0};
    test(testInput, testTarget, result);

    // [1, 1, 1, 1, 1], 1 ==> [0, 4]
    testInput = new int[] {1, 1, 1, 1, 1};
    testTarget = 1;
    result = new int[] {0, 4};
    test(testInput, testTarget, result);

    // [1, 1, 1, 1, 1], 2 ==> [-1, -1]
    testInput = new int[] {1, 1, 1, 1, 1};
    testTarget = 2;
    result = new int[] {-1, -1};
    test(testInput, testTarget, result);

    // [1, 2, 3, 4], 3 ==> [2, 2]
    testInput = new int[] {1, 2, 3, 4};
    testTarget = 3;
    result = new int[] {2, 2};
    test(testInput, testTarget, result);

    // [1, 3, 3, 5, 7, 8, 9, 9, 9, 15], 9 ==> [6, 8]
    testInput = new int[] {1, 3, 3, 5, 7, 8, 9, 9, 9, 15};
    testTarget = 9;
    result = new int[] {6, 8};
    test(testInput, testTarget, result);

    // [100, 150, 150, 153], 150 ==> [1, 2]
    testInput = new int[] {100, 150, 150, 153};
    testTarget = 150;
    result = new int[] {1, 2};
    test(testInput, testTarget, result);

    // [1, 2, 3, 4, 5, 6, 10], 9 ==> [-1, -1]
    testInput = new int[] {1, 2, 3, 4, 5, 6, 10};
    testTarget = 9;
    result = new int[] {-1, -1};
    test(testInput, testTarget, result);

    // [1, 1, 1, 2, 2, 2, 5, 5, 5, 5, 5, 5, 5, 5], 2 ==> [3, 5]
    testInput = new int[] {1, 1, 1, 2, 2, 2, 5, 5, 5, 5, 5, 5, 5, 5};
    testTarget = 2;
    result = new int[] {3, 5};
    test(testInput, testTarget, result);
  }

  public static void test(final int[] input, final int target, final int[] expected) {
    int[] actual = findFirstAndLastIndices(input, target);
    
    if (Arrays.equals(expected, actual)) {
      System.out.println("✔️  Test Success!");
    } else {
      System.out.println("❌ Test Failed!");
      System.out.println("\t- InputArr : \"" + Arrays.toString(input) + "\"");
      System.out.println("\t- Target   : " + target);
      System.out.println("\t- Expected : \"" + Arrays.toString(expected) + "\"");
      System.out.println("\t- Received : \"" + Arrays.toString(actual) + "\"");
    }
  }

  public static int[] findFirstAndLastIndices(final int[] inputSortedArray, final int target) {
    int[] result = {-1, -1};
    if (inputSortedArray.length < 1) return result;

    int firstFoundIndex = -1, lastFoundIndex = -1;

    int low = 0;
    int high = inputSortedArray.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      int midElement = inputSortedArray[mid];
      if (midElement == target) {
        firstFoundIndex = mid;
        if (lastFoundIndex == -1) {
          lastFoundIndex = mid;
        }
        // Continue searching on left to find the first occurrence
        high = mid - 1;
      } else if (midElement > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    if (firstFoundIndex == -1) {
      return result;
    }

    low = lastFoundIndex + 1;
    high = inputSortedArray.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      int midElement = inputSortedArray[mid];
      if (midElement == target) {
        lastFoundIndex = mid;
        // Continue searching on right to find the last occurrence
        low = mid + 1;
      } else if (midElement > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    result[0] = firstFoundIndex;
    result[1] = lastFoundIndex;
    return result;
  }

}