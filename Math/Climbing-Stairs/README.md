# Climbing Stairs

## Problem
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps


Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


 

Constraints:

1 <= n <= 45

## Example
**Input**: Standard sample input  
**Output**: Expected sample output  
**Explanation**: Standard problem evaluation flow.

## Difficulty
Easy

## DSA Pattern
Math, Dynamic Programming, Memoization

## Concepts Used
- Array / Data Structure Traversal
- Time & Space Optimization
- Logical Boundary Check

## Prerequisites
- Basic understanding of JAVA syntax
- Fundamental knowledge of data structures (Math, Dynamic Programming, Memoization)

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
[View Problem on LeetCode](https://leetcode.com/problems/climbing-stairs/)

## Solution
```java
class Solution {    public int climbStairs(int n) {        if (n == 1) {            return 1;        }        int prev2 = 1;        int prev1 = 2;        for (int i = 3; i <= n; i++) {            int curr = prev1 + prev2;            prev2 = prev1;            prev1 = curr;        }        return prev1;    }}
class Solution {
    public int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }

        int prev2 = 1;
        int prev1 = 2;

        for (int i = 3; i <= n; i++) {

            int curr = prev1 + prev2;

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}


```
