class Solution {
    public char findTheDifference(String s, String t) {
        int[] charCounts = new int[26];

        // Count the occurrences of each character in string s
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // Subtract the occurrences of each character in string t
        for (char c : t.toCharArray()) {
            charCounts[c - 'a']--;
        }

        // Find the character with non-zero count
        for (int i = 0; i < 26; i++) {
            if (charCounts[i] != 0) {
                return (char) (i + 'a');
            }
        }

        // Default return if no difference found
        return ' ';
    }
}