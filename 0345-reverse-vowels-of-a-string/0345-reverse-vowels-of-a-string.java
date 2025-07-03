class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;

        String[] arr = s.split("");

        while(left < right){
            if (arr[left].matches("[^AEIOUaeiou]")) {
                left++;
            }

            if (arr[right].matches("[^AEIOUaeiou]")) {
                right--;
            }

            if (arr[left].matches("[AEIOUaeiou]") && arr[right].matches("[AEIOUaeiou]")) {
                String temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        StringBuilder reverse = new StringBuilder();
        for (String str : arr) {
            reverse.append(str);
        }

        return reverse.toString();
    }
}