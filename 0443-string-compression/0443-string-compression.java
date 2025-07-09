class Solution {
    public int compress(char[] chars) {
        int s = 0;
        int e = s + 1;

        StringBuilder sb = new StringBuilder();
        while(e < chars.length) {
            if (chars[s] != chars[e]) {
                sb.append(chars[s]);

                if (e - s > 1) {
                    sb.append(e - s);
                }

                s = e;
            }

            e++;
        }

        sb.append(chars[s]);
        
        if (e - s > 1) {
            sb.append(e - s);
        }

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}