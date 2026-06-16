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

        HashMap <Character, Integer> setS = convertHashMap(s);
        HashMap <Character, Integer> setT = convertHashMap(t);

        // System.out.print(setS);
        //  System.out.print(setT);

        if(setS.equals(setT)){
            return true;
        }
     
         return false;
    }
}
