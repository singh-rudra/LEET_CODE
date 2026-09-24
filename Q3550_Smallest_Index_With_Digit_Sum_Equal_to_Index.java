package LEET_CODE;

class Q3550_Smallest_Index_With_Digit_Sum_Equal_to_Index {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]!=0){
                sum+=nums[i]%10;
                nums[i]/=10;
            }
            if(sum==i)
                return i;
        }
        return -1;
    }
}