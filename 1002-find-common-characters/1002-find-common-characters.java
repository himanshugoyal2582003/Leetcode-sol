class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> arr = new ArrayList<>();

        String a = words[0];

        for(int i =0 ; i< a.length();i++){
            String c = ""+a.charAt(i);
            Boolean check = true;
            for(int j =0 ; j<words.length ; j++){
                if(words[j].indexOf(c)== -1){
                    check = false;
                    break;
                }
            }
            if(check == true){
                arr.add(c);

                for (int j = 0; j < words.length; j++) {
                    int index = words[j].indexOf(c);

                    if (index != -1) {
                        words[j] = words[j].substring(0, index) + words[j].substring(index + 1);
                    }
                }
            }
        }
        return arr;
    }
}