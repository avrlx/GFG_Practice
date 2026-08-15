# Search in Rotated Sorted Array

**Difficulty:** Medium

**GeeksforGeeks:** [View Problem](https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1)

**Topics:** Searching, Divide and Conquer

## Problem Statement

Given an array **arr[]** of **distinct**elements, which was initially **sorted in ascending order** but then **rotated** at some unknown pivot, the task is to find the index of a target **key**.  If the key is not present in the array, return **-1**.

**Examples :**

```text
Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is found at index 8.
```

```text
Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: There is no element that has value 6.
```

```text
Input: arr[] = [33, 42, 72, 99], key = 42
Output: 1
Explanation: 42 is found at index 1.
```

**Constraints**:
1 &le; arr.size() &le; 10^6
0 &le; arr[i] &le; 10^6
0 &le; key &le; 10^6
