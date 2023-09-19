class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>(); // Map to store the count of each number

        // Iterate through the array and count the occurrences of each number
        for (int num : nums) {
            if (numCount.containsKey(num)) {
                return num; // Found the duplicate number
            }
            numCount.put(num, 1);
        }

        return -1; // No duplicate found (shouldn't happen for this problem)
    }
}