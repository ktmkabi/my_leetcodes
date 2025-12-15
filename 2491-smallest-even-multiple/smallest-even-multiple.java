class Solution {
    public int smallestEvenMultiple(int n) {
        int sp;
        if(n%2==0){
            sp = n;
        }
        else{
            sp = n*2;
        }
        return sp;
    }
}