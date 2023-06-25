import java.util.HashMap;
import java.lang.*;
public class String {
    public static int firstUniqChar(String s) {
        //construction of a hashtable
        //key--unique characters in the string
        //value--frequency of each character in the string
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        //scan the entire hash table and get the index of non repeating character
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    private int length() {
        return 0;
    }
    private Character charAt(int i) {
        return null;
    }
    public static void main(String[] args) {
        java.lang.String s = "Leetcode";
        System.out.println(firstUniqChar(s));
    }
    private static char[] firstUniqChar(java.lang.String s) {
        return null;
    }
}
//time complexity:O(n)
//space complexity:O(n)
