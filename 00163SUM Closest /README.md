## [16. 3Sum Closest](https://leetcode.com/problems/3sum-closest/) 
## Medium

### Problem Statement
Given an integer array `nums` of length `n` and an integer `target`, find three integers at distinct indices in `nums` such that the sum is closest to `target`.

Return the sum of the three integers.  
You may assume that each input would have exactly one solution.

---

### Example 1
**Input:**  
`nums = [-1,2,1,-4], target = 1`  

**Output:**  
`2`  

**Explanation:**  
The sum that is closest to the target is `2` (`-1 + 2 + 1 = 2`).

---

### Example 2
**Input:**  
`nums = [0,0,0], target = 1`  

**Output:**  
`0`  

**Explanation:**  
The sum that is closest to the target is `0` (`0 + 0 + 0 = 0`).

---

### Constraints
- `3 <= nums.length <= 500`  
- `-1000 <= nums[i] <= 1000`  
- `-10^4 <= target <= 10^4`  

---

### Approach
1. **Sort the array** to simplify traversal.  
2. Iterate through each element `nums[i]` and use a **two-pointer technique** to find the closest sum to `target`.  
3. Track the minimum difference between the current sum and `target`.  
4. Return the sum with the smallest difference.  

---

### Complexity
- **Time:** `O(n^2)` (sorting + two-pointer search)  
- **Space:** `O(1)` (excluding input storage)  
