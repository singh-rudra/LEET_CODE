class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int sum=nums[0]+nums[1]+nums[2];
      for(int i=0;i<nums.length-2;i++){
        if(i>0 && nums[i]==nums[i-1])
            continue;
        int left=i+1;
        int right=nums.length-1;
        while(left<right){
            int sum1=nums[i]+nums[left]+nums[right];
            if (Math.abs(target-sum1) < Math.abs(target-sum)){
                sum=sum1;
            }
            if(sum1==target)
                return sum1;
            else if(sum1<target)
                left++;
            else
                right--;            
        }    
      }
      return sum;
    }
}