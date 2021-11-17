# Problem Statement Analysis
## 1. Key points
- Input
    - `Node head`
        - Head of a singly linked list of integers

- Output
    - Reverse and print the input singly linked list
        - Using iteration
        - Using recursion

- Example
    - `4 -> 3 -> 2 -> 1 -> 0 -> NULL` ==> `0 -> 1 -> 2 -> 3 -> 4 -> NULL`

## 2. Questions to validate assumptions
- Can the input singly linked list be empty?
    - Yes. `head` can be `NULL`
- Should the reversal be in-place and without creating a new list?
    - Yes. The space complexity must be `O(1)`

## 3. Test Examples
- `NULL` ==> `NULL`

- `1 -> NULL` ==> `1 -> NULL`

- `1 -> 2 -> 3 -> NULL` ==> `3 -> 2 -> 1 -> NULL`

- `4 -> 3 -> 2 -> 1 -> 0 -> NULL` ==> `0 -> 1 -> 2 -> 3 -> 4 -> NULL`

---

# Solution Design
## Approach#1 (Possibly, brute force)
1. Iteration
    1. Initialize `prev` as `NULL`
    1. For each node, `curr` which is not `NULL`:
        1. Save the `next` link to a `tmp` variable
        1. Change the `next` link to `prev`
        1. Change `prev` to `curr`
        1. Change `curr` to `tmp`

1. Recursion - `reverseList(head, NULL)`
    1. `void reverseList(Node curr, Node prev)`
    1. Base case:
        1. Return, if `curr.next` is `NULL`
    1. `reverseList(curr.next, curr)`
    1. Change `curr.next` to `prev`

### Complexity - Time & Space
- Time complexity : `O(n)`
    - Each node has to be visited and its `next` link has to be modified
- Space complexity
    - `O(1)` for Iteration
        - Constant space is used for computation
    - `O(n)` for Recursion
        - There will be `n` recursive calls and each recursive call stacks up on memory until returned

## Approach#2
1. 
1. 

### Complexity - Time & Space
- 
