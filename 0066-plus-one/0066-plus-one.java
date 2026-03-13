class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            else if(digits[i]==9){
                digits[i]=0;
            }
            
        }
        //999
        int[] Arr = new int[digits.length+1];
        Arr[0]=1;
        return Arr;
        
    }
}