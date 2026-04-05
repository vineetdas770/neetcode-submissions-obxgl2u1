class Solution {
    public int trap(int[] height) {
        /*
         height = [0,2,0,3,1,0,1,3,2,1]
         
         left   = [0,0,2,0,3,3,3,3,3,3]
         right  = [3,3,3,3,3,3,3,2,1,0]
         
         output  = min[0,0,2,0,3,3,3,2,1,0] - nums
        */
        
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] output = new int[n];
        left[0] = 0;
        right[n-1] = 0;

        for(int i = 1 ; i<n ; i++){
            left[i] =  Math.max(left[i-1],height[i-1]);
        }

        for(int i = n-2 ; i>=0 ; i--){
            right[i] =  Math.max(right[i+1],height[i+1]);
        }

        for(int i = 0 ; i<n ; i++){
            int op = Math.min(left[i],right[i]) - height[i];
            if(op > 0){
                output[i] = op;
            }
            else{
                output[i] = 0;
            }
        }
        
        return Arrays.stream(output).sum();
    }
}
