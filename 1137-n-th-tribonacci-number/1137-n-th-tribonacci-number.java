class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int ft = 0;
        int st = 1;
        int tt = 1;
        for(int i = 1;i<=n;i++){
            int ts = ft+st+tt;
            ft = st;
            st =tt;
            tt = ts;
        }
        return ft;
    }
}