class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length -1;
        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(nums);

        for (int i=0 ; i<n; i++){
            
            if(nums[i]>0){
                break;
            }

            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = n;
            while (left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum>0){
                    right--;
                }
                else if (sum<0){
                    left++;
                }
                else{
                    output.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                    while(left< right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left< right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
            }

        }
        return output;
    }
}
