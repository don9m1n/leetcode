class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(List.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < right && !vowels.contains(arr[left])) {
                left++;
            }

            while(left < right && !vowels.contains(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}