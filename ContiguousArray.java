// Time Complexity : O(n) 
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//Approach: We will iteratew over entire input array, and we will use running sum such that 0 -> -1 and 1-> 1. We will also track rSum and max here. 
class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int rSum = 0;
        int max = 0;
        for (int i=0; i< nums.length; i++){
            if(nums[i]==0 ){
                rSum--;
            }
            else{
                rSum++;
            }
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            }
            else{
                map.put(rSum,i);
            }
        }

        return max;
    }
}