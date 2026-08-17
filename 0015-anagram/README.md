# Anagram

**Difficulty:** Easy

**GeeksforGeeks:** [View Problem](https://www.geeksforgeeks.org/problems/anagram-1587115620/1)

**Topics:** Strings, Sorting

## Problem Statement

Given two non-empty strings **s1**and **s2**, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
 Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

**Examples:**

```text
Input: s1 = "geeks" s2 = "kseeg"
Output: true
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
```

```text
Input: s1 = "allergy", s2 = "allergyy"
Output: false
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams.
```

```text
Input: s1 = "listen", s2 = "lists"
Output: false
Explanation: The characters in the two strings are not the same &mdash; some are missing or extra. So, they are not anagrams.
```

**Constraints:**
1 &le; s1.size(), s2.size() &le; 10^5
s1, s2 consists of lowercase English letters.
