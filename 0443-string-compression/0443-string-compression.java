class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int write = 0;
        while (i < chars.length) {
            char currentChar = chars[i];
            int anchor = i;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
            }

            chars[write++] = currentChar;

            int count = i - anchor;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}