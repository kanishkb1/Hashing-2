// Time Complexity : O(n) 
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//Approach: We will use running sum concept. We will iterate through array, if sum not exist, will store in hashmap. If exist, will add in the hashmap. 



class Solution {
    public int subarraySum(int[] nums, int k) {
        
        //create a hashmap to store occurences of running sum 
        HashMap <Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int count = 0;
        int rSum = 0;
        //iterate through entire array and calculate sum till that index position
        for (int i=0;i<nums.length;i++){
                rSum += nums[i];

                //if the (rSum - k) is already present, increase the count for particular key
                if(map.containsKey(rSum - k)){
                    count += map.get(rSum - k);
                }
                //if the rSum does not exist before, add the rSum to hashmap
                if(!map.containsKey(rSum)){
                    map.put(rSum,0);
                }

                
                map.put(rSum,map.get(rSum)+1);
        }
        return count;
    }
}