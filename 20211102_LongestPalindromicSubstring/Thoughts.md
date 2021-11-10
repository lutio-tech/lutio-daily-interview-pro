# Problem Statement Analysis
## 1. Key points
- Input
    - `String inputString`
- Output
    - `String longestPalindromicSubstring`
- Example
    - "banana" ==> "anana"
        - `inputString = "banana"`
        - `longestPalindromicSubstring = "anana"`

    - "million" ==> "illi"
        - `inputString = "million"`
        - `longestPalindromicSubstring = "illi"`

## 2. Questions to validate assumptions
- Can a single character string be considered as a palindrome?
    - Yes
- Should the palindrome be case sensitive?
    - No. "Racecar" and "racecar" are both palindromes
- Can whitespaces be ignored?
    - No. "race car" is not a palindrome
- If the inputString has multiple palindromic substrings of the same longest length, can the first found substring be returned as the longest?<br/>
Example: `racecaroncartrack` ==> `racecar`, `cartrac` ==> `racecar`
    - Yes

## 3. Test Examples
- "" ==> ""
    - `inputString = ""`
    - `longestPalindromicSubstring = ""`
- "a" ==> "a"
    - `inputString = "a"`
    - `longestPalindromicSubstring = "a"`
- "aa" ==> "aa"
    - `inputString = "aa"`
    - `longestPalindromicSubstring = "aa"`
- "aaa" ==> "aaa"
    - `inputString = "aaa"`
    - `longestPalindromicSubstring = "aaa"`
- "abc" ==> "a"
    - `inputString = "abc"`
    - `longestPalindromicSubstring = "a"`
- "aba" ==> "aba"
    - `inputString = "aba"`
    - `longestPalindromicSubstring = "aba"`
- "abba" ==> "abba"
    - `inputString = "abba"`
    - `longestPalindromicSubstring = "abba"`
- "baabbba" ==> "abbba"
    - `inputString = "baabbba"`
    - `longestPalindromicSubstring = "abbba"`
- "banana" ==> "anana"
    - `inputString = "banana"`
    - `longestPalindromicSubstring = "anana"`
- "million" ==> "illi"
    - `inputString = "million"`
    - `longestPalindromicSubstring = "illi"`
- "racecartrackhasnoracecaronit" ==> "noracecaron"
    - `inputString = "racecartrackhasnoracecaronit"`
    - `longestPalindromicSubstring = "noracecaron"`

---

# Solution Design
## Approach#1 (Possibly, brute force)
1. For each character in the `inputString` as pivot, find the longest possible palindromic substring spanning out from the pivot
    1. With the `currentCharacter` as the pivot, we can find `oddLengthPalindrome`<br/>
    Example: For `caba`, when `b` is the pivot, `oddLengthPalindrome` is `aba`
    1. With `currentCharacter + previousCharacter` as the pivot, we can find `evenLengthPalindrome`<br/>
    Example: For `cabba`, when `bb` is the pivot, `evenLengthPalindrome` is `abba`
    1. Replace `longestPalindromicSubstring` if the found palindromic substring (`oddLengthPalindrome` or `evenLengthPalindrome`) is longer
1. Return `longestPalindromicSubstring`

### Complexity - Time & Space
- Time complexity : `O(n^2)`
    - For each character as pivot, at most n/2 iterations are needed to span out and find palindromic substring
    - The n/2 iterations will run twice, one for `evenLengthPalindrome` and one for `oddLengthPalindrome`
- Space complexity : `O(n)`
    - The `longestPalindromicSubstring` can be of atmost length of n

## Approach#2
1. 
1. 

### Complexity - Time & Space
- 
