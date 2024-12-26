//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
//26. Remove Duplicates from Sorted Array

class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        //Edge Case: If the array is empty or has only one element, return it's length.
        if(nums.length == 0){
            return 0;
        }
        //Pointer to track the last unique element index
        int i=0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}