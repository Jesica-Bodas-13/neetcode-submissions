class Solution {

    public static HashMap <Character, Integer> convertHashMap (String x){
            // Char [] xSplit = x.split("");
            HashMap <Character, Integer> setX = new HashMap <> ();

            for (char item : x.toCharArray()){
                setX.put(item, setX.getOrDefault(item, 0) + 1);
            }
            return (setX);


        // System.out.print("s");

        }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;


        HashMap <Character, Integer> setS = convertHashMap(s);
        HashMap <Character, Integer> setT = convertHashMap(t);

        // System.out.print(setS);
        //  System.out.print(setT);

        return  (setS.equals(setT));
    }
}
