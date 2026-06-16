class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String s : strs) {
            result.append(s.length()).append("#").append(s);
        }
        System.out.print(result);
        return result.toString();
    }

    public List<String> decode(String str) {
        int pointerOne = 0;
        // int pointerTwo = 1;

        List<String> resultList = new ArrayList<> ();

        while(pointerOne < str.length()){
            // if((str.indexOf("#",pointerOne) - pointerOne) == 1){
                int stringLength = Integer.parseInt(str.substring(pointerOne, str.indexOf("#",pointerOne)));
                // pointerOne = ;
                String resultString = str.substring((str.indexOf("#",pointerOne) + 1), str.indexOf("#", pointerOne)+1+stringLength);
                pointerOne = str.indexOf("#", pointerOne) + 1 + stringLength;
                resultList.add(resultString);
            
            }

            
        return resultList;
        }

        
    }

