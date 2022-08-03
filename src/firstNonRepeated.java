public class firstNonRepeated {
    public static Object FirstNonRepeated(String s){
        char[] chars = s.toCharArray();
        int[] count = new int[26];
        for(char c : chars){
            count[c-'a']++;
        }
        for(char c : chars){
            if(count[c-'a'] == 1){
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args){
        String s = "aabbccdd";
        System.out.println(FirstNonRepeated(s));
    }
}
