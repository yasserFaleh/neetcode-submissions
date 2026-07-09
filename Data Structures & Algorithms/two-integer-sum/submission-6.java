class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indexI = 0;
        int indexJ = nums.length - 1;

        int[] numsC = nums.clone();
        Arrays.sort(numsC);
        int sum = numsC[indexI] + numsC[indexJ];
        while (sum != target){
            if (sum < target)
                indexI++;
            else 
                indexJ--;
            sum = numsC[indexI] + numsC[indexJ];
        }
        int[] res = new int[2];
        for (int i = 0; i<nums.length; i++)
            if (nums[i] == numsC[indexI]){
                res[0] = i;
                break;
            }
        for (int i = 0; i<nums.length; i++)
            if (nums[i] == numsC[indexJ] && i != res[0]){
                res[1] = i;
                break;
            }

        Arrays.sort(res);
        return res;
    }
}
