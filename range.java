public class range {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        for (int candidate = 0; candidate <= n; candidate++) {
            boolean found = false;
            for (int num : nums) {
                if (num == candidate) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return candidate;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));
    }
}