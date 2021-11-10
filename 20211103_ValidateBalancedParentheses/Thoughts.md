# Problem Statement Analysis
## 1. Key points
- Input
    - `String inputString`
        - Can be empty string
        - Will have only characters '`(`', '`)`', '`{`', '`}`', '`[`', and '`]`'
- Output
    - `boolean isBalanced = true`, if
        - `inputString` is empty
        - Open brackets  are closed by the same type of brackets and in the correct order
            - '`(`' closed with '`)`'
            - '`{`' closed with '`}`'
            - '`[`' closed with '`]`'
    - `boolean isBalanced = false`, if
        - `inputString` has characters other than '`(`', '`)`', '`{`', '`}`', '`[`', and '`]`'
- Example
    - "`((()))`" ==> `true`
        - `inputString = "((()))"`
        - `isBalanced = true`
    - "`[()]{}`" ==> `true`
        - `inputString = "((()))"`
        - `isBalanced = true`
    - "`({[)]`" ==> `false`
        - `inputString = "({[)]"`
        - `isBalanced = false`

## 2. Questions to validate assumptions

## 3. Test Examples
- "" ==> `true`
    - `inputString = ""`
    - `isBalanced = true`
- "`(`" ==> `false`
    - `inputString = "("`
    - `isBalanced = false`
- "`)`" ==> `false`
    - `inputString = ")"`
    - `isBalanced = false`
- "`()(){(())`" ==> `false`
    - `inputString = "()(){(())"`
    - `isBalanced = false`
- "`([{}])()`" ==> `true`
    - `inputString = "([{}])()"`
    - `isBalanced = true`
- "`({[)]}`" ==> `false`
    - `inputString = "({[)]}"`
    - `isBalanced = false`

---

# Solution Design
## Approach#1 (Possibly, brute force)
1. Base case: If `inputString` is empty, return `true`
1. For each character in `inputString`,
    - if it is an open bracket - '`(`', '`{`', '`[`'
        - push it to a stack
    - if it is a closed bracket - '`)`', '`}`', '`]`' - and the stack is not empty
        - pop from stack and check if it is the corresponding open bracket
    - else, return `false`
1. After parsing the `inputString` if the stack is not empty, return `false`; else return `true`

### Complexity - Time & Space
- Time complexity : `O(n)`
    - Has to parse the string at most till the end (when all are open brackets)
- Space complexity : `O(n)`
    - Stack size can at most be `n` (when all are open brackets)

## Approach#2
1. 
1. 

### Complexity - Time & Space
- 
