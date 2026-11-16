class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            List<String> arr = new ArrayList<>();
            String sen = "";

            for (int i = 0; i < s.length(); i++) {

                sen += s.charAt(i);

                if (sen.length() == k) {
                    arr.add(sen);
                    sen = "";
                }
            }

            if (!sen.isEmpty()) {
                arr.add(sen);
            }

            String ans = "";

            for (String str : arr) {
                int sum = 0;

                for (char ch : str.toCharArray()) {
                    sum += ch - '0';
                }

                ans += sum;
            }

            s = ans;
        }

        return s;
    }
}