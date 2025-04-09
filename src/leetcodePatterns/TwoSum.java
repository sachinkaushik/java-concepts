package leetcodePatterns;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TwoSum {

    public int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff= target - arr[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(arr[i],i);

        }
        return new int[]{-1,-1}; // Return -1 if no solution found
    }



    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = {2, 7, 11, 15};
        int target = 19;
        int[] result = twoSum.twoSum(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
