class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        long i=1;
        while(i<n){
            i=i*2;
        }
        if(i==n){
            return true;
        }else{
            return false;
        }
    }
}
