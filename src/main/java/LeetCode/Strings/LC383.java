package LeetCode.Strings;

public class LC383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charMap = new int[26];
        for(char letter: magazine.toCharArray()){
            charMap[letter - 'a']++;
        }
        for(char noteLetter: ransomNote.toCharArray()){
            if(charMap[noteLetter - 'a'] == 0){
                return false;
            }else {
                charMap[noteLetter - 'a']--;
            }
        }
        return true;
    }
}
