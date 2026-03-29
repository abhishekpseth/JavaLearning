package InterviewQuestions.CodingProblems;

import java.util.HashMap;

// 2. Given an array of integers nums and a target integer target, return the indices of the two numbers that add up to the target.
//    You must solve it in O(n) time complexity using HashMap.
public class Problem2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        int n = nums.length;

        for(int i=0; i<n; i++){
            mp.put(nums[i], i);
        }

        for(int i=0; i<n; i++){
            if(mp.containsKey(target - nums[i]) && mp.get(target - nums[i]) != i){
                int[] arr = {i, mp.get(target - nums[i])};
                return arr;
            }
        }

        int[] arr = {-1, -1};
        return arr;
    }
    public static void main(String[] args) {

    }
}
