# Merge Intervals

## Problem
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].


Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


Example 3:

Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.


 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104

## Example
**Input**: Standard sample input  
**Output**: Expected sample output  
**Explanation**: Standard problem evaluation flow.

## Difficulty
Medium

## DSA Pattern
Array, Sorting, Quicksort

## Concepts Used
- Array / Data Structure Traversal
- Time & Space Optimization
- Logical Boundary Check

## Prerequisites
- Basic understanding of JAVA syntax
- Fundamental knowledge of data structures (Array, Sorting, Quicksort)

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
[View Problem on LeetCode](https://leetcode.com/problems/merge-intervals/)

## Solution
```java
class Solution {    public int[][] merge(int[][] intervals) {        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));        List<int[]> ans = new ArrayList<>();        ans.add(intervals[0]);        for(int i=1; i<intervals.length; i++){            int[] lastInterval = ans.get(ans.size() - 1);            if(intervals[i][0] <= lastInterval[1]){                lastInterval[1] = Math.max(lastInterval[1], intervals[i][1]);            }            else{                ans.add(intervals[i]);            }        }        return ans.toArray(new int[ans.size()][]);    }}
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for(int i=1; i<intervals.length; i++){
            int[] lastInterval = ans.get(ans.size() - 1);
            if(intervals[i][0] <= lastInterval[1]){
                lastInterval[1] = Math.max(lastInterval[1], intervals[i][1]);
            }
            else{
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}


```
