package Lec21;

public class Check_Set_UnSet {
    public static void main(String[] args) {
        int n=21;
        int k=3;
        int mask=n>>k;
        if((mask & 1)!=0){
            System.out.println("Set");
        }
        else {
            System.out.println("unset");
        }
    }
}
