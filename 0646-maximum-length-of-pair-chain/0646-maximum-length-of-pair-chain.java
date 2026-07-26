class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b)-> Integer.compare(a[1],b[1]));

        int a =0;
        int pi = pairs[0][1];

        for(int i =1 ; i< pairs.length ; i++){
            if(pairs[i][0]<=pi){
                a++;
            }else{
                pi = pairs[i][1];
            }
        }
        return pairs.length - a;
    }
}