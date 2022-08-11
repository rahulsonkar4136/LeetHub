class Solution {
    public boolean isSubsequence(String s, String t) {
        int iterS = 0;
        int iterT = 0;
        int found = 0;
        while (iterS < s.length())
        {
           while (iterT < t.length()){
                if (s.charAt(iterS) == t.charAt(iterT)){
                    ++found;
                    ++iterT;
                    break;
                }
               ++iterT;
            }
            ++iterS;
        }
        return found == s.length();
    }
}