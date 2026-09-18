# 3sum

## Problem
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 
Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.


Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.


Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.


 
Constraints:


	3 <= nums.length <= 3000
	-105 <= nums[i] <= 105



## Example
**Input**: Standard sample input  
**Output**: Expected sample output  
**Explanation**: Standard problem evaluation flow.

## Difficulty
Medium

## DSA Pattern
Array, Two Pointers, Sorting

## Concepts Used
- Array / Data Structure Traversal
- Time & Space Optimization
- Logical Boundary Check

## Prerequisites
- Basic understanding of JAVA syntax
- Fundamental knowledge of data structures (Array, Two Pointers, Sorting)

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
[View Problem on LeetCode](https://leetcode.com/problems/3sum/)

## Solution
```java
                }                while(i<j && nums[j] == nums[j                +1]){                    j = j-1;                }            }        }    }    public List<List<Integer>> threeSum(int[]     nums) {        Arrays.sort(nums);        List<List<Integer>> res = new         ArrayList<>();        for(int f = 0; f<nums.length; f++){            if(nums[f]>0){                break;            }            if(f == 0 || nums[f] != nums[f-1]){                twoSum(f,nums,res);            }        }            return res;    }
                }
                while(i<j && nums[j] == nums[j
                +1]){
                    j = j-1;
                }
            }
        }
    }
    public List<List<Integer>> threeSum(int[] 
    nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new 
        ArrayList<>();
        for(int f = 0; f<nums.length; f++){
            if(nums[f]>0){
                break;
            }
            if(f == 0 || nums[f] != nums[f-1]){
                twoSum(f,nums,res);
            }
        }
            return res;
    }


```
