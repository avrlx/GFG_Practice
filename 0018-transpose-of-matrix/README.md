# Transpose of Matrix

**Difficulty:** Easy

**GeeksforGeeks:** [View Problem](https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1)

**Topics:** Matrix

## Problem Statement

Given a square matrix of size **n x n**, return the**transpose** matrix of the given matrix.

The **transpose** of a matrix is obtained by converting all the rows to columns and all the columns to rows.

**Examples:**

```text
Input: mat[][] = [[1, 1, 1, 1], [2, 2, 2, 2], [3, 3, 3, 3], [4, 4, 4, 4]]
Output: [[1, 2, 3, 4], [1, 2, 3, 4], 1, 2, 3, 4], [1, 2, 3, 4]]
Explanation: Converting rows into columns and columns into rows.
```

```text
Input: mat[][] =  [[1, 2], [9, -2]]
Output: [[1, 9], [2, -2]]
Explanation: Converting rows into columns and columns into rows.
```

**Constraints:**
1 &le; n &le; 10^3
-10^9 &le; mat[i][j] &le;10^9
