# Problem Statement Analysis
## 1. Key points
- Input
    - `String inputString`
- Output
    - `Integer maxLengthOfUniqueSubstring` Length of the longest substring with unique characters
- Example
    - "abrkaabcdefghijjxxx" ==> "abcdefghij"
        - `inputString = "abrkaabcdefghijjxxx"`
        - `maxLengthOfUniqueSubstring = 10`

## 2. Questions on Problem Statement
- 

## 3. Test Examples
- "" ==> "" (Base case)
    - `inputString = ""`
    - `maxLengthOfUniqueSubstring = 0`
- "aaa" ==> "a"
    - `inputString = "aaa"`
    - `maxLengthOfUniqueSubstring = 1`
- "abcdefcdabjkf" ==> "efcdabjk"
    - `inputString = "abcdefcdabjkf"`
    - `maxLengthOfUniqueSubstring = 8`
---

# Solution Design
## 1. Assumptions
- `inputString` can be null
- `inputString` can contain any characters (including UTF-8)
- `inputString.length()` is not larger than `Integer.MAX_VALUE`

## 2. Approach
1. Use Sliding-window approach to hold the `startIndex` and `endIndex` of substring
1. Use a `Map<Character, Integer>` to hold characters against the `lastFoundIndex` of the characters
1. For each character, use the map to check if it has been already found
1. If the character already exist in the Map,
    1. Update the `startIndex` if the `lastFoundIndex` of the character is greater than `startIndex`
1. Calculate the length of substring (Sliding-window) and update `maxLengthOfUniqueSubstring` if current length is greater

## 3. First Solution (Probably, brute force)
```
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
```

### Complexity - Time & Space
- 

## 4. Optimized Solution
- 
```
```

### Complexity - Time & Space
- 
