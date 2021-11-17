# Problem Statement Analysis
## 1. Key points
- Input
    - `Integer[] inputSortedArray`
        - Ascendingly sorted integer array
        - Can have duplicate values
    - `Integer target`
        - Target to be searched for in the `inputSortedArray`
        - Target may or may not be present in the `inputSortedArray`

- Output
    - `Integer firstFoundIndex` and `Integer lastFoundIndex` to be output in the format:<br/>
    "`[firstFoundIndex, lastFoundIndex]`"
        - `firstFoundIndex` is the first found index of the `target` in the `inputSortedArray`
        - `lastFoundIndex` is the last found index of the `target` in the `inputSortedArray`
    - If `target` is not found in the `inputSortedArray`, `firstFoundIndex = lastFoundIndex = -1`

- Example
    - `[1,3,3,5,7,8,9,9,9,15], 9` ==> `[6, 8]`
        - `inputSortedArray = [1,3,3,5,7,8,9,9,9,15]`
        - `target = 9`
        - `firstFoundIndex = 6`
        - `lastFoundIndex = 8`
    - `[100, 150, 150, 153], 150` ==> `[1, 2]`
        - `inputSortedArray = [100, 150, 150, 153]`
        - `target = 150`
        - `firstFoundIndex = 1`
        - `lastFoundIndex = 2`
    - `[1,2,3,4,5,6,10], 9` ==> `[-1, -1]`
        - `inputSortedArray = [1,2,3,4,5,6,10]`
        - `target = 9`
        - `firstFoundIndex = -1`
        - `lastFoundIndex = -1`
    - `[1,1,1,2,2,2,5,5,5,5,5,5,5,5], 2` ==> `[3 , 5]`
        - `inputSortedArray = [1,1,1,2,2,2,5,5,5,5,5,5,5,5]`
        - `target = 2`
        - `firstFoundIndex = 3`
        - `lastFoundIndex = 5`

## 2. Questions to validate assumptions
- If `target` occurs justs once in the `inputSortedArray` can `firstFoundIndex` and `lastFoundIndex` both hold the same index of the `target` in `inputSortedArray`?
    - Yes
    - `[1,2,3,4], 3` ==> `[2, 2]`

## 3. Test Examples
- `[1,1,1,1,1], 1` ==> `[0, 4]`
    - `inputSortedArray = [1,1,1,1,1]`
    - `target = 1`
    - `firstFoundIndex = 0`
    - `lastFoundIndex = 4`
- `[1,1,1,1,1], 2` ==> `[-1, -1]`
    - `inputSortedArray = [1,1,1,1,1]`
    - `target = 2`
    - `firstFoundIndex = -1`
    - `lastFoundIndex = -1`
- `[1,2,3,4], 3` ==> `[2, 2]`
    - `inputSortedArray = [1,2,3,4]`
    - `target = 2`
    - `firstFoundIndex = 2`
    - `lastFoundIndex = 2`
- `[1,3,3,5,7,8,9,9,9,15], 9` ==> `[6, 8]`
    - `inputSortedArray = [1,3,3,5,7,8,9,9,9,15]`
    - `target = 9`
    - `firstFoundIndex = 6`
    - `lastFoundIndex = 8`
- `[100, 150, 150, 153], 150` ==> `[1, 2]`
    - `inputSortedArray = [100, 150, 150, 153]`
    - `target = 150`
    - `firstFoundIndex = 1`
    - `lastFoundIndex = 2`
- `[1,2,3,4,5,6,10], 9` ==> `[-1, -1]`
    - `inputSortedArray = [1,2,3,4,5,6,10]`
    - `target = 9`
    - `firstFoundIndex = -1`
    - `lastFoundIndex = -1`

---

# Solution Design
## Approach#1 (Possibly, brute force)
1. Initialize `firstFoundIndex = lastFoundIndex = -1`
1. Since `inputSortedArray` is sorted, binary search can be done to find `target` in O(log n)
1. Once an occurrence is found, assign `firstFoundIndex` and `lastFoundIndex` to that index
1. To get the first occurrence, continue binary search on the left of `firstFoundIndex` while the value at `middle` is `target`
1. To get the last occurrence,  continue binary search on the right of `lastFoundIndex` while the value at `middle` is `target`

### Complexity - Time & Space
- Time complexity : `O(log n)`
    - Binary search of complexity O(n) is done twice, one to get the first occurrence and another to get the last occurrence of the target
- Space complexity : `O(1)`
    - Constant space is used for computation

## Approach#2
1. 
1. 

### Complexity - Time & Space
- 
