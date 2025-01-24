//https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
//189. Rotate Array

public class RotateArray {
        public void rotate(int[] nums, int k) {
            int n = nums.length; // Getting size of the array
            k = k % n;   // Adjust K if it is greater than the array size

            reverse(nums, 0, n - 1); // Step1: Reverse the whole array first
            reverse(nums, 0, k - 1 ); // Step2: Reverse the first K element
            reverse(nums, k, n - 1); // Step3: Reverse the rest of the array
        }

        private void reverse(int[] nums, int start, int end){
            while(start < end){
                int temp = nums[start]; // Swapping start and end
                nums[start] = nums[end];
                nums[end] = temp;
                start ++;
                end --;
            }
        }
}
