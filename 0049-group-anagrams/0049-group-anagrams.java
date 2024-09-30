class Solution {

    private String getFreq(String str){
        int[] freq=new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder fs=new StringBuilder("");
        char c='a';
        for(int i:freq){
            fs.append(c);
            fs.append(i);
            c++;
        }
        return fs.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)
        return new ArrayList<>();
        Map<String,List<String>> freq=new HashMap<>();
        for(String str:strs){

            String fs=getFreq(str);

            if(freq.containsKey(fs)){
                freq.get(fs).add(str);
            }
            else{
                List<String> strl=new ArrayList<>();
                strl.add(str);
                freq.put(fs,strl);
            }
        }
        return new ArrayList<>(freq.values());
        
    }
}