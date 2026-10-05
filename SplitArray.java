public class SplitArray {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        int k=2;

        System.out.println(Array(nums,k));
    }
    public static int Array(int[] nums, int k) {
        int start=0;
        int end=0;

        for (int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }

        while(start<end){
            int mid=start+(end-start)/2;

            int sum=0;
            int piecse=1;
            for(int num:nums){
                if(sum + num >mid){
                    sum=num;
                    piecse++;
                }else{
                    sum+=num;
                } 
            }
            if(piecse >k){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;
    }    
}
