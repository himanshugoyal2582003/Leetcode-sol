class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String sc = "";
        Collections.sort(dictionary);
        for( String t : dictionary){
            int i =0, j=0;

            while(i< s.length() && j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    j++;
                }
                i++;
            }

            if(j==t.length() && sc.length()<t.length()){
                sc = t;
            }
        }

        return sc ;

    }
}