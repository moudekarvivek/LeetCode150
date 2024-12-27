
//https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
//169. Majority Element
public class MajorityElement {
        public int majorityElement(int[] nums) {
            int candidate = nums[0];
            int count = 0;

            //finding the majority candidate
            for(int num : nums){
                if(count == 0){
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }
            return candidate;
        }
    }

