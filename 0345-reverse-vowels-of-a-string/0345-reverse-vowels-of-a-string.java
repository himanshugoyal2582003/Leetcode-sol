class Solution {
    public String reverseVowels(String s) {
        int l =0;
        int r = s.length()-1;

        char[] arr = s.toCharArray();

        while(l<r){
            if(!isVowel(arr[l])){
                l++;
            }else if(!isVowel(arr[r])){
                r--;
            }else{
                char temp = arr[l];
                arr[l]=arr[r];
                arr[r]=temp;

                l++;
                r--;
            }
        }
        return new String(arr);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}