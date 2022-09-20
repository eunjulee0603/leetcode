class Solution {
    public int pivotIndex(int[] nums) {
        int[] P = new int[nums.length+1];
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        
        P[0] = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            P[i+1] = sum;
        }
        for(int j=0;j<nums.length;j++){
            leftSum = P[j];
            System.out.println(P[j]);
            rightSum = P[nums.length] - leftSum - nums[j];
                
            if( leftSum == rightSum ){
                return j;
            }
        }
        
        return -1;
    }
}