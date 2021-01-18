class Solution {
    public int minPartitions(String n) {
        int max=0;
        int digit;
        for(int i=0;i<n.length();i++){
            digit=Character.getNumericValue(n.charAt(i));
            if (digit==9){
                return 9;
            }
            else{
                if(digit>max){
                    max=digit;
                }
            }
        }
        return max;
    }
}
