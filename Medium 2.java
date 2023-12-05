/*			BuildHer Interview Questions
Medium 2
Given an integer array of size n, find all elements that appear more than n/3 times.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElements {
    public static List<Integer> majorityElements(int[] nums) {
        int n = nums.length;
        int limit = n / 3;

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check for elements appearing more than n/3 times
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > limit) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {3, 2, 3};
        System.out.println("Elements appearing more than n/3 times in nums1: " + majorityElements(nums1));

        int[] nums2 = {1};
        System.out.println("Elements appearing more than n/3 times in nums2: " + majorityElements(nums2));

        int[] nums3 = {1, 2};
        System.out.println("Elements appearing more than n/3 times in nums3: " + majorityElements(nums3));
    }
}
