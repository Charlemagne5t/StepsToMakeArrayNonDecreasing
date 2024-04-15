import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int max = 0;

        int peak = nums[0];

        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{nums[0], 0});
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] >= peak){
                stack.clear();
                peak = nums[i];
                stack.push(new int[]{nums[i], 0});
                continue;
            }
            if(nums[i] < stack.peek()[0]){
                stack.push(new int[]{nums[i], 1});
                max =Math.max(max , 1);
            }else {
                int c = 0;
                while (stack.peek()[0] <= nums[i]){
                    c = Math.max(stack.pop()[1], c);
                }
                stack.push(new int[]{nums[i], c + 1});
                max =Math.max(max, c + 1);
            }
        }

        return max;
    }
}