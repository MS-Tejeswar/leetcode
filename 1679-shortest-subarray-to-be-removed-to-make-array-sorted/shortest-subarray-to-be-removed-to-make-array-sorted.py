class Solution:
    def findLengthOfShortestSubarray(self, arr: List[int]) -> int:
        n = len(arr)
    
        # Step 1: Find the longest non-decreasing prefix
        left = 0
        while left + 1 < n and arr[left] <= arr[left + 1]:
            left += 1
        
        # If the entire array is non-decreasing, return 0
        if left == n - 1:
            return 0
        
        # Step 2: Find the longest non-decreasing suffix
        right = n - 1
        while right > 0 and arr[right - 1] <= arr[right]:
            right -= 1
        
        # Step 3: Calculate the minimum length to remove
        # Option 1: Remove everything between left and right
        result = min(n - left - 1, right)  # Case where we remove either prefix or suffix completely
        
        # Option 2: Merge prefix and suffix with minimal removal in the middle
        i, j = 0, right
        while i <= left and j < n:
            if arr[i] <= arr[j]:
                result = min(result, j - i - 1)  # Remove subarray between i and j
                i += 1
            else:
                j += 1
        
        return result

            