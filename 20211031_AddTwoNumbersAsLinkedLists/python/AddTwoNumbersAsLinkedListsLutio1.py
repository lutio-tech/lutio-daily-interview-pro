#####################################
# Definition for singly-linked list
#####################################
class ListNode(object):
  def __init__(self, x):
    self.val = x
    self.next = None

#####################################
# Solution class
#####################################
class Solution:
  def addTwoNumbers(self, l1, l2, c = 0):
    if (l1 == None and l2 == None and c == 0):
      return None

    firstVal = 0
    firstNext = None
    if (l1 != None):
      firstVal = l1.val
      firstNext = l1.next

    secondVal = 0
    secondNext = None
    if (l2 != None):
      secondVal = l2.val
      secondNext = l2.next
    
    sum = firstVal + secondVal + c
    sumDigit = sum % 10
    carry = (sum - sumDigit) // 10

    sumList = ListNode(sumDigit)
    sumList.next = self.addTwoNumbers(firstNext, secondNext, carry)
    return sumList

#####################################
# Tests
#####################################
l1 = None
l2 = None

# Expected result: 7 0 8
# l1 = ListNode(2)
# l1.next = ListNode(4)
# l1.next.next = ListNode(3)
# l2 = ListNode(5)
# l2.next = ListNode(6)
# l2.next.next = ListNode(4)

# Expected result: 7 0 9 1
# l1 = ListNode(2)
# l1.next = ListNode(4)
# l1.next.next = ListNode(9)
# l2 = ListNode(5)
# l2.next = ListNode(6)
# l2.next.next = ListNode(9)

# Expected result: 1 5
# l1 = ListNode(2)
# l1.next = ListNode(4)
# l2 = ListNode(9)

# Expected result: 8 0 0 0 1
l1 = ListNode(9)
l1.next = ListNode(9)
l1.next.next = ListNode(9)
l1.next.next.next = ListNode(9)
l2 = ListNode(9)

result = Solution().addTwoNumbers(l1, l2)
while result:
  print(result.val, end=" ")
  result = result.next
