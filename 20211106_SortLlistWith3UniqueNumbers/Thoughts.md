# Problem Statement Analysis
## 1. Key points
- Input
    - List of numbers `inputList` with only 3 unique numbers (1, 2, 3)
- Output

- Example
 - `[3, 3, 2, 1, 3, 2, 1]` ==> `[1, 1, 2, 2, 3, 3, 3]`
    - `inputList`: [3, 3, 2, 1, 3, 2, 1]
    - `outputList`: [1, 1, 2, 2, 3, 3, 3]

## 2. Questions to validate assumptions
- Will the 3 unique numbers be always 1, 2 and 3?
    - Yes
- Can the `inputList` be empty?
    - No. Atleast 1 element will be present in the `inputList`

## 3. Test Examples
- `[1]` ==> `[1]`
- `[1, 2, 3]` ==> `[1, 2, 3]`
- `[3, 3, 3]` ==> `[3, 3, 3]`
- `[3, 2, 2, 1, 3, 2, 1]` ==> `[1, 1, 2, 2, 2, 3, 3]`
---

# Solution Design
## Approach#1 (Possibly, brute force)
1. Use `countArray[3]` to hold the count of elements from the unsorted array
1. Parse the `inputList` and for each element `x` in the `inputList`:
    1. Increment the count stored at `countArray[x-1]`
1. Replace the elements in the `inputList` using the counts in `countArray`

### Complexity - Time & Space
- Time complexity : `O(n)` 
    - The `inputList` is parsed once to get the count of elements ==> `O(n)`
    - The `inputList` is parsed again to replace each element based on the counts stored in `countsArray` ==> `O(n)`
    - Time complexity : `2 * O(n)`
- Space complexity: `O(1)`
    - Space used is always constant and is irrespective of the `inputList` length

## Approach#2
1. 
1. 

### Complexity - Time & Space
- 
