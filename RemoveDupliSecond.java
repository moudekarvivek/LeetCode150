//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
//80. Remove Duplicates from Sorted Array II
public class RemoveDupliSecond {
        public int removeDuplicates(int[] nums) {
            // Handle arrays with 2 or fewer elements, which are always valid
            if (nums.length <= 2) {
                return nums.length;
            }

            int i = 2; // Start placing elements from the third position

            for (int j = 2; j < nums.length; j++) {
                // Check if nums[j] can be included
                if (nums[j] != nums[i - 2]) {
                    nums[i] = nums[j]; // Place the valid element at index i
                    i++; // Move the pointer for the next valid position
                }
            }

            return i; // The length of the modified array with valid elements
        }

    }

