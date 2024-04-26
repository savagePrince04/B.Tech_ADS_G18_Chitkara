package Lec18;

import java.util.Arrays;

public class Edit_Distance {
    public static void main(String[] args) {
        String s1="horse";
        String s2="ros";
        int dp[][]=new int[s1.length()][s2.length()];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        int ans=Distance(s1,s2,0,0,dp);
        System.out.println(ans);
    }
    // s1 i
    //s2 j
    public static int Distance(String s1,String s2,int i,int j,int dp[][]){
        if(s1.length()==i){
            return s2.length()-j;
        }
        if(s2.length()==j){
            return s1.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
       if(s1.charAt(i)==s2.charAt(j)) {
           ans=Distance(s1,s2,i+1,j+1,dp);

       }
       else {
           int D=Distance(s1,s2,i+1,j,dp);
           int I=Distance(s1,s2,i,j+1,dp);
           int R=Distance(s1,s2,i+1,j+1,dp);
           ans=1+Math.min(D,Math.min(I,R));
       }
       return dp[i][j]=ans;
    }
}
