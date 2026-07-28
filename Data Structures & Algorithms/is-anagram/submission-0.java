class Solution {
    public boolean isAnagram(String s, String t) {
    int[] count = new int[26];
        int[] count1 = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count1[c - 'a']++;
        }
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        for (int i : count) {
            sb.append("#").append(i);
        }
        for (int i : count1) {
            sb1.append("#").append(i);
        }
        // System.out.println(sb);
        // System.out.println(sb1);
        String s1 = sb.toString();
        String s2 = sb1.toString();
        if (s1.equals(s2)) {
            return true;
        }
        return false;

    }
}
