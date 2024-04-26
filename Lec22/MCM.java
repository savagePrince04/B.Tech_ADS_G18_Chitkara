package Lec22;

public class MCM {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int i=1;
        int j= arr.length-1;
        int ans=Solve(arr,i,j);
        System.out.println(ans);
    }
    public static int Solve(int arr[],int i,int j){
        if(i>=j){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int c1=Solve(arr,i,k);
            int c2=Solve(arr,k+1,j);
            int c3=arr[i-1]*arr[k]*arr[j];
            int temp=c1+c2+c3;
            if(min>temp){
                min=temp;
            }
        }
        return min;
    }
}
