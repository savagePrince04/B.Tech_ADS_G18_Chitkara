package Lec21;

public class Single_Number {
    public static void main(String[] args) {
           int nums[]={2,2,1,1,5};
                int ans=0;
                for(int i=0;i<nums.length;i++){
                    ans=ans^nums[i];
                }
          System.out.println(ans);
            }
        }
