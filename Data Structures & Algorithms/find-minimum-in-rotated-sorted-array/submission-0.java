class Solution {
    public int findMin(int[] nums) {
        int minMax=nums[0];

        int left = 0;
        int right = nums.length -1;

        while(left<=right){

            if(nums[left]<nums[right]){
                minMax = Math.min(nums[left],minMax);
                break;
            }
            int mid = left + (right-left)/2;
            minMax = Math.min(minMax,nums[mid]);
            if(nums[left]<=nums[mid]){
                left = mid + 1;
            }else{
                right = mid -1;
            }

        }
        return minMax;
    }
}
