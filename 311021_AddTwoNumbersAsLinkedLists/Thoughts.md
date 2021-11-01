# Problem Statement Analysis
## 1. Key points
- Input
    - 2 linked lists = 2 non-negative integers
    - each node holds a single digit
    - digits stored in reverse order (Eg: 234 is stored as 4 -> 3 -> 2)

- Output
    - sum of the input numbers
    - must be another linked list in the same format

- Example
    - 342 + 465 = 807
        - n1 : (2 -> 4 -> 3) 
        - n2 : (5 -> 6 -> 4)
        - sum: (7 -> 0 -> 8)

## 2. Questions on Problem Statement
- Should carry over addition be handled?
    - Yes, definitely. Even problem example shows that. (4 + 6 = 10)
- Will the input linked lists always be of same length?
    - Let's assume that they can be of varying lengths. (942 + 98 = 1040)
- Can linked lists be empty?
    - Yes. Let's assume that the input lists can be empty.

## 3. Test Examples
- 942 + 569 = 1907
    - n1 : (2 -> 4 -> 9)
    - n2 : (9 -> 6 -> 5)
    - sum: (7 -> 0 -> 9 -> 1)

- 999 + 1 = 1000
    - n1 : (9 -> 9 -> 9)
    - n2 : (1)
    - sum: (0 -> 0 -> 0 -> 1)

- 3202 + 0 = 3202
    - n1 : (2 -> 0 -> 2 -> 3) 
    - n2 : NULL
    - sum: (2 -> 0 -> 2 -> 3)
---

# Solution Design
## 1. Assumptions
- Numbers are never negative
- Numbers are in decimal number system (base 10)
- Carry over addition must be handled
- Numbers can be of varying lengths
- There could be empty numbers represented with null linked lists

## 2. Approach
1. Traverse the linked lists `l1` and `l2` together from their heads
1. Keep initial value of `carry = 0`
1. Add node values and carry to get `sum = l1.val + l2.val + carry`
1. Get carry value by rounded division with 10 `carry = sum / 10`
    - Max value of `carry` is 1 and min value of `carry` is 0 as max value of digits is 9 (and 9 + 9 = 18)
1. Get the digit of sum by modulo with 10 `sumDigit = sum % 10`
1. Move to the next digits with `l1.next` and `l2.next`

## 3. First Solution (Probably, brute force)
- With recursion
```
def addTwoNumbers(self, num1, num2, carry = 0):
    # Base case
    if (num1 == None and num2 == None and carry == 0):
        return None

    # Evaluate digit of firstNumber
    firstVal = 0
    firstNext = None
    if (num1 != None):
        firstVal = num1.val
        firstNext = num1.next

    # Evaluate digit of secondNumber
    secondVal = 0
    secondNext = None
    if (num2 != None):
        secondVal = num2.val
        secondNext = num2.next

    # Compute Sum, SumDigit and Carry
    sum = firstVal + secondVal + carry
    sumDigit = sum % 10
    carry = (sum - sumDigit) // 10

    # Update to linked list
    sumList = ListNode(sumDigit)
    sumList.next = self.addTwoNumbers(firstNext, secondNext, carry)
    return sumList
```

### Complexity - Time & Space
- Time complexity : `O(n + m)`
    - `n` is the number of digits in `num1`
    - `m` is the number of digits in `num2`
    - Every digit is parsed only once and hence complexity is `O(n + m)`
- Space complexity : `O(n + m + x)`
    - `n` is the number of digits in `num1`
    - `m` is the number of digits in `num2`
    - `x` is the number of digits in `sum`
    - Due to recursion, memory adds up for each recursive call

## 4. Optimized Solution
- 
```
```

### Complexity - Time & Space
- 
