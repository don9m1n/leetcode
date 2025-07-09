class Solution {
    public int compress(char[] chars) {
        int s = 0;
        int e = 1;

        StringBuilder sb = new StringBuilder();
        while(e < chars.length) {
            if (chars[s] != chars[e]) {

                int length = e - s;
                // 그룹 문자 생성
                sb.append(chars[s]);
                sb.append(length == 1 ? "" : length);
                s = e;
            }

            e++;
        }
        int length = e - s;
        sb.append(chars[s]);
        sb.append(length == 1 ? "" : length);

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}