# Fibonacci Number

## Problem
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.


Given n, calculate F(n).

 

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.


Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.


Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.


 

Constraints:

0 <= n <= 30

## Example
**Input**: Standard sample input  
**Output**: Expected sample output  
**Explanation**: Standard problem evaluation flow.

## Difficulty
Easy

## DSA Pattern
Math, Dynamic Programming, Recursion, Memoization

## Concepts Used
- Array / Data Structure Traversal
- Time & Space Optimization
- Logical Boundary Check

## Prerequisites
- Basic understanding of JAVA syntax
- Fundamental knowledge of data structures (Math, Dynamic Programming, Recursion, Memoization)

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
[View Problem on LeetCode](https://leetcode.com/problems/fibonacci-number/)

## Solution
```java
class Solution {    static int printfib(int n){        if(n<=1){            return n;        }        return printfib(n-1) + printfib(n-2);    }    public int fib(int n) {            return printfib(n);    }}
class Solution {
    static int printfib(int n){
        if(n<=1){
            return n;
        }
        return printfib(n-1) + printfib(n-2);
    }
    public int fib(int n) {
        
    return printfib(n);
    }
}


```
