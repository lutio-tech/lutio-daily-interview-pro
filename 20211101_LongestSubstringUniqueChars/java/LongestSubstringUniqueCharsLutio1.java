import java.util.HashMap;
import java.util.Map;

public class LongestSubstringUniqueCharsLutio1 {

public static void main(String[] args) {
    String testString = "";
    System.out.println("Length of Longest Unique Substring of " + testString + ": " + lengthOfLongestSubstring(testString));

    testString = "aaa";
    System.out.println("Length of Longest Unique Substring of " + testString + ": " + lengthOfLongestSubstring(testString));

    testString = "abrkaabcdefghijjxxx";
    System.out.println("Length of Longest Unique Substring of " + testString + ": " + lengthOfLongestSubstring(testString));

    testString = "abcdefdcabjkf";
    System.out.println("Length of Longest Unique Substring of " + testString + ": " + lengthOfLongestSubstring(testString));

    testString = "a";
    System.out.println("Length of Longest Unique Substring of " + testString + ": " + lengthOfLongestSubstring(testString));

    testString = "कमलनमकह";
    System.out.println("Length of Longest Unique Substring of " + testString + ": " + lengthOfLongestSubstring(testString));
}

public static Integer lengthOfLongestSubstring(String inpuString) {
    Integer maxLengthOfUniqueSubstring = 0;
    Map <Character, Integer> charToLastFoundIndexMap = new HashMap<>();

    for (Integer startIndex = 0, currIndex = 0, currLength = 0; currIndex < inpuString.length(); ++currIndex) {
        // 1 - Get current character from input string
        Character currCharacter = inpuString.charAt(currIndex);

        // 2 - Slide startIndex if current character is in charToLastFoundIndexMap and if lastFoundIndex is within the Sliding-window
        Integer lastFoundIndex = charToLastFoundIndexMap.get(currCharacter);
        if (charToLastFoundIndexMap.containsKey(currCharacter)) {
            startIndex = Math.max(lastFoundIndex + 1, startIndex);
        }

        // 3 - Update lastFoundIndex of current character in the map
        charToLastFoundIndexMap.put(currCharacter, currIndex);

        // 4 - Update maxLengthOfUniqueSubstring if current length of Sliding-window is larger
        currLength = currIndex - startIndex + 1;
        maxLengthOfUniqueSubstring = Math.max(currLength, maxLengthOfUniqueSubstring);
    }

    return maxLengthOfUniqueSubstring;
}

}