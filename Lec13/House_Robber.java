package Lec13;
import java.util.*;
public class House_Robber {
    public static void main(String[] args) {
        int nums[]={2,7,9,3,1};
        int dp[]=new int[nums.length];  // 0 0 0 00 0 0
        Arrays.fill(dp,-1);
        System.out.println(robber(nums,0,dp));
    }
        public static int robber(int nums[],int i,int dp[]){
            if(i>=nums.length){
                return 0;
            }
            if(dp[i]!=-1){
                return dp[i];
            }
            int rob=nums[i]+robber(nums,i+2,dp);
            int dont_rob=robber(nums,i+1,dp);
            return dp[i]=Math.max(rob,dont_rob);
        }
    }