package leetcodePatterns;

public class PrefixSum {

    private int[] prefixSum;

    public PrefixSum(int[] nums) {
        // Initialize prefix sum array
        prefixSum = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];  // Store cumulative sum
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left]; // Compute sum in O(1)
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        PrefixSum obj = new PrefixSum(nums);

        System.out.println(obj.sumRange(0, 2)); // Output: 1
        System.out.println(obj.sumRange(2, 5)); // Output: -1
        System.out.println(obj.sumRange(0, 5)); // Output: -3
    }
}
