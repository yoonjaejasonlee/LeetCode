/* 1770. Maximum Score from Performing Multiplication Operations
https://leetcode.com/problems/Maximum-Score-From-Performing-Multiplication-Operations */


Class Solution{
    public int maximumScore(int[] nums , int [] multipliers){
        Integer [][] dp = new Integer[multipliers.length][multipliers.length];

        return helper(nums,multipliers,0,0,dp);
    }

    public int helper(int[]nums, int [] multipliers, int n, int m, Integer[][] dp){
        if(m >= mutlipliers.length){
            return 0;
        }

        if(dp[n][m] != null){
            return dp[n][m];
        }

        int leftside = (multipliers[m] * nums[n]) + helper(nums, multipliers, n+1, m+1, dp);
        int rightside = (multipliers[m] * nums[nums.length-1-(m-n)]) + helper(nums,multipliers, n, m+1, dp);


        return dp[n][m] = Math.max(leftside,rightside);
    }


}