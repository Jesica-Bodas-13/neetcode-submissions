class Solution {

    public static HashMap <String, Integer> convertHashMap (String x){
            String [] xSplit = x.split("");
            HashMap <String, Integer> setX = new HashMap <> ();

            for (String item : xSplit){
                if(!setX.containsKey(item)){
                    setX.put(item,1);
                }else{
                    int value = setX.get(item);
                    int updatedValue = value + 1;

                    setX.put(item, updatedValue);
                }
            }
            return (setX);


        // System.out.print("s");

        }

    public boolean isAnagram(String s, String t) {
        HashMap <String, Integer> setS = convertHashMap(s);
        HashMap <String, Integer> setT = convertHashMap(t);

        System.out.print(setS);
         System.out.print(setT);

        if(setS.equals(setT)){
            return true;
        }
     
         return false;
    }
}
