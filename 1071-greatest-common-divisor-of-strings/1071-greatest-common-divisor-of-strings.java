class Solution {
    public String gcdOfStrings(String str1, String str2) {
         String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            String prefix =  str1.substring(0, i + 1);

            if (str1.replace(prefix, "").isEmpty() && str2.replace(prefix, "").isEmpty()) {
                answer = prefix;
            }
        }

        return answer;
    }
}