# Binary Search

**Difficulty:** Basic

**GeeksforGeeks:** [View Problem](https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1)

**Topics:** Searching, Binary Search

## Problem Statement

Given an array **arr[],**sorted in ascending order and an integer **k**. Return true if k is present in the array, otherwise, false.

**Examples:**

```text
Input: arr[] = [1, 2, 3, 4, 6], k = 6
Output: true
Exlpanation: Since, 6 is present in the array at index 4 (0-based indexing), output is true.
```

```text
Input: arr[] = [1, 2, 4, 5, 6], k = 3
Output: false
Exlpanation: Since, 3 is not present in the array, output is false.
```

```text
Input: arr[] = [2, 3, 5, 6], k = 1
Output: false
```

**Constraints:**
1 &le; arr.size() &le; 10^6
1 &le; k &le; 10^6
1 &le; arr[i] &le; 10^6
