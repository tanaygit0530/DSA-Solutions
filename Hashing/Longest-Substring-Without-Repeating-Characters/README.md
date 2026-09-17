# Longest Substring Without Repeating Characters

## Problem
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.


Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.


Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


 

Constraints:

0 <= s.length <= 105
s consists of English letters, digits, symbols and spaces.

## Example
**Input**: Standard sample input  
**Output**: Expected sample output  
**Explanation**: Standard problem evaluation flow.

## Difficulty
Medium

## DSA Pattern
Hash Table, String, Sliding Window

## Concepts Used
- Array / Data Structure Traversal
- Time & Space Optimization
- Logical Boundary Check

## Prerequisites
- Basic understanding of JAVA syntax
- Fundamental knowledge of data structures (Hash Table, String, Sliding Window)

## Approach
1. Parse input parameters and analyze boundary conditions.
2. Apply optimal algorithm to process data cleanly.
3. Return the calculated target result.

## Algorithm
1. Initialize variables and state containers.
2. Iterate through input elements sequentially.
3. Apply logic condition and construct output.
4. Return final output.

## Dry Run

| Step | State | Operation | Result |
| :--- | :--- | :--- | :--- |
| 1 | Initial | Setup variables | Ready |
| 2 | Processing | Execute algorithm | Target matched |

## Code Explanation
- The code handles problem constraints with efficient iteration.
- Core algorithm uses target checking to ensure correctness.

## Complexity Analysis
- **Time Complexity**: $O(N)$ — Evaluates each element in a single traversal pass.
- **Space Complexity**: $O(1)$ — Uses minimal extra memory state.

## Edge Cases
- Empty or single-element inputs
- Boundary limits and edge threshold values

## Alternative Approach
A brute force approach would require checking all pairs ($O(N^2)$ time), whereas this optimal solution runs in linear $O(N)$ time.

## Key Takeaway
Always look for optimal data structure lookups to reduce search time complexity.

## LeetCode
[View Problem on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

## Solution
```java
class Solution {    public int lengthOfLongestSubstring(String s) {        int max = 0;        int i = 0;         int j = 0;        Set<Character> set = new HashSet<>();        while(j<s.length()){            char c = s.charAt(j);            while(set.contains(c)){                set.remove(s.charAt(i));                i++;            }            set.add(c);            max = Math.max(max,j-i+1);            j++;        }        return max;    }}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0; 
        int j = 0;
        Set<Character> set = new HashSet<>();
        while(j<s.length()){
            char c = s.charAt(j);
            while(set.contains(c)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}


```
