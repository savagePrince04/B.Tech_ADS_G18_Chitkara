package Lec20;

import java.util.PriorityQueue;

public interface Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        int k=2;
        int ans=kthMax(arr,k);
        System.out.println(ans);
    }
    public static int kthMax(int arr[],int k){
        PriorityQueue<Integer> sc=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            sc.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(sc.peek()<arr[i]){
                sc.remove();
                sc.add(arr[i]);
            }
        }
        return sc.peek();
    }
}
