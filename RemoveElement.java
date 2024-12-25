//https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
//27. Remove Element

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = 0; //Pointer to track the position for valid elements

        for(int i=0; i < nums.length; i++){
            if(nums[i] != val){ // If the current element is not equal to val
                nums[j] = nums[i];// place it at the Jth Position
                j++;  //Increment the pointer J
            }
        }
        return j; // Return the count of valid Elements
    }
}