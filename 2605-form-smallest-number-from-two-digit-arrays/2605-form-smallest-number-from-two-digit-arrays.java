class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
    
        
        
          int ans=Integer.MAX_VALUE;
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i]==nums2[j])
                 ans = Math.min(ans,nums2[j]);
                else{
                    ans = Math.min(nums1[i]*10+nums2[j], ans);
                    ans = Math.min(nums2[j]*10 + nums1[i], ans);
                }
            }
        }
         return ans;
}}