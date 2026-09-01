class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String sc = "";
        for( String t : dictionary){
            if(t.length()>s.length()){continue;}
            int i =0, j=0;

            while(i< s.length() && j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    j++;
                }
                i++;
            }

            if(j == t.length() &&
   (sc.length() < t.length() ||
   (sc.length() == t.length() && t.compareTo(sc) < 0))) {
    sc = t;
}
        }

        return sc ;

    }
}