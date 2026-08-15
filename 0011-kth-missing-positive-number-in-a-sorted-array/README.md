# Kth Missing Positive Number in a Sorted Array

**Difficulty:** Medium

**GeeksforGeeks:** [View Problem](https://www.geeksforgeeks.org/problems/kth-missing-positive-number-in-a-sorted-array/1)

**Topics:** Binary Search, Arrays

## Problem Statement

Given a **sorted**array of distinct positive integers **arr[]**, You need to find the **kth** positive number that is **missing**from the arr[].

**Examples:**

```text
Input: arr[] = [2, 3, 4, 7, 11], k = 5
Output: 9
Explanation: Missing are 1, 5, 6, 8, 9, 10&hellip; and 5th missing number is 9.
```

```text
Input: arr[] = [1, 2, 3], k = 2
Output: 5
Explanation: Missing are 4, 5, 6&hellip; and 2nd missing number is 5.
```

```text
Input: arr[] = [3, 5, 9, 10, 11, 12], k = 2
Output: 2
Explanation: Missing are 1, 2, 4, 6&hellip; and 2nd missing number is 2.
```

**Constraints:**
1 &le; arr.size() &le; 10^51 &le; k &le; 10^5
1 &le; arr[i] &le; 10^6^
