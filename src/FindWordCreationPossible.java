import java.util.HashMap;

public class FindWordCreationPossible {
    public static void main(String[] args) {
        String chars = "myabcdefghijklmnopqrstuvwxqwertasdfgzxcvbuiopjklhmnbvhdjeasdguitqowepejhkladsbvcnafdsafnkjlsad" +
                "hgasjdklfmghajiuweqgaksldnlakslf casdfacfh adsklfdskjajfhsajkfhhh klf dkljsafh sdjklafhfasjaklljdsafhl " +
                "fdjklasal adsflhdsalifafjaskvcxmnghads..........,,,,,,,'''''''''";
        String words = "The java.lang.Character.toLowerCase char ch converts the character argument to " +
                "lowercase using case mapping information from the UnicodeData file ";
        System.out.println(possibleWordsCount(chars, words));
    }

    private static boolean possibleWordsCount(String chars, String words) {
        HashMap<Character, Integer> dict = new HashMap();
        int i;

        for(i = 0; i < chars.length(); i++) {
            char c = Character.toLowerCase(chars.charAt(i));
            if(dict.containsKey(c)){
                int val = dict.get(c);
                dict.put(c, val+1);
            } else {
                dict.put(c, 1);
            }
        }

        for(i = 0; i < words.length(); i++ ) {
            char c = Character.toLowerCase(words.charAt(i));
            if(dict.containsKey(c) && dict.get(c) > 0){
                int val = dict.get(c);
                dict.put(c, val-1);
            } else {
                return false;
            }
        }
        return true;
    }

}
