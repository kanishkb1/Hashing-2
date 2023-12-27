// Time Complexity : O(n) where m is number of strings and n is average length of strings
// Space Complexity : O(n) as hashset is used
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//Approach: We will iterate through the entire string character by character and based on the count, we will decide the longest palindrome of the string in form of length.
import java.util.HashSet;
class LongestPalindrome{
    public int longestPalindrome(String s) {
        int count = 0;

        HashSet <Character> set = new HashSet<>();
        for (int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(set.contains(c)){
                count+=2;
                set.remove(c);
            }else{
                set.add(c);
            }

        }
                if(!set.isEmpty()){
                    count++;
            }
      
        return count;
    }
}